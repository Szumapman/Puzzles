package com.endlesspowerskills;

import java.math.BigInteger;
import java.util.Arrays;

public class Puzzle {

    /*  ------------------------------------
        Reverse a String. If String == null or is empty we return empty string.
        Using API
    */
    public String reverseStringWithAPI(String stringToRevers){
        if(stringToRevers == null){
            return "";
        }
        return new StringBuilder(stringToRevers).reverse().toString();
    }

    // Without API
    public String reverseStringWithoutAPI1(String stringToRevers){
        if(stringToRevers == null){
            return "";
        }
        char[] tabFromStringToReverse = stringToRevers.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i = tabFromStringToReverse.length -1; i >= 0; i--){
            result.append(tabFromStringToReverse[i]);
        }
        return result.toString();
    }

    public String reverseStringWithoutAPI2(String stringToRevers){
        if(stringToRevers == null){
            return "";
        }
        char[] tabFromStringToReverse = stringToRevers.toCharArray();
        int start = 0;
        int end = tabFromStringToReverse.length-1;
        while (start < end){
            char temp = tabFromStringToReverse[end];
            tabFromStringToReverse[end] = tabFromStringToReverse[start];
            tabFromStringToReverse[start] = temp;
            start++;
            end--;
        }
        return new String(tabFromStringToReverse);
    }

    public String reverseStringWithoutAPI3_Recursive(String stringToRevers){
        if(stringToRevers == null){
            return "";
        }
        if(stringToRevers.length() == 0){
            return stringToRevers;
        }
        return reverseStringWithoutAPI3_Recursive(stringToRevers.substring(1)) + stringToRevers.charAt(0);
    }

     /* ------------------------------------
        Is two strings are anagram? If any of String == null throw the illegalArgumentException
     */
    public boolean isAnagram1(String s1, String s2){
        if(s1 == null || s2 == null){
            throw new IllegalArgumentException("None of strings to check can't be null");
        }
        if(s1.length() != s2.length()){
            return false;
        }
        char[] tabFromS1 = s1.toLowerCase().toCharArray();
        char[] tabFromS2 = s2.toLowerCase().toCharArray();
        Arrays.sort(tabFromS1);
        Arrays.sort(tabFromS2);

        return Arrays.equals(tabFromS1, tabFromS2);
    }

    public boolean isAnagram2(String s1, String s2){
        if(s1 == null || s2 == null){
            throw new IllegalArgumentException("None of strings to check can't be null");
        }
        if(s1.length() != s2.length()){
            return false;
        }
        char[] tabFromS1 = s1.toLowerCase().toCharArray();
        StringBuilder sbFromS2 = new StringBuilder(s2.toLowerCase());//I'm using stringBuilder to avoid creation to many strings
        for(int i = 0; i < tabFromS1.length; i++){
            // Option 1
            int index = sbFromS2.indexOf(tabFromS1[i] + "");
            if(index == -1){
                return false;
            } else {
                sbFromS2.deleteCharAt(index);
            }
            // Option 2
//            for(int j = 0; j < sbFromS2.length(); j++){
//                if(tabFromS1[i] == sbFromS2.charAt(j)){
//                    sbFromS2.deleteCharAt(j);
//                    break;
//                }
//                if(j == sbFromS2.length()-1){
//                    return false;
//                }
//            }
        }
        return true;
    }

    public boolean isAnagram3(String s1, String s2){
        if(s1 == null || s2 == null){
            throw new IllegalArgumentException("None of strings to check can't be null");
        }
        if(s1.length() != s2.length()){
            return false;
        }
        char[] tabFromS1 = s1.toLowerCase().toCharArray();
        char[] tabFromS2 = s2.toLowerCase().toCharArray();

        // Solution for polish alphabet
        // I create tables with length 35 (26 - number of letters from latin alphabet + 9 letters specific for polish alphabet)
        // indexed at: ą - 26, ć - 27, ę - 28, ł - 29, ń - 30, ó - 31, ś - 32, ź - 33, ż - 34
        int[] numberOfOccuresOfCharsFromS1 = new int[35];
        int[] numberOfOccuresOfCharsFromS2 = new int[35];

        // count each character in the tables word
        for(int i = 0; i < tabFromS1.length; i++){
            int position1 = tabFromS1[i] - 'a';
            if(position1 > 25){
                position1 = checkPosition(tabFromS1[i]);
            }
            numberOfOccuresOfCharsFromS1[position1] = numberOfOccuresOfCharsFromS1[position1] + 1;

            int position2 = tabFromS2[i] - 'a';
            if(position2 > 25){
                position2 = checkPosition(tabFromS2[i]);
            }
            numberOfOccuresOfCharsFromS2[position2] += 1;
        }

        for(int i = 0; i < numberOfOccuresOfCharsFromS1.length; i++){
            if(numberOfOccuresOfCharsFromS1[i] != numberOfOccuresOfCharsFromS2[i]){
                return false;
            }
        }
        return true;
    }

    private int checkPosition(char c) {
        switch(c){
            case 'ą':
                return 26;
            case 'ć':
                return 27;
            case 'ę':
                return 28;
            case 'ł':
                return 29;
            case 'ń':
                return 30;
            case 'ó':
                return 31;
            case 'ś':
                return 32;
            case 'ź':
                return 33;
            case 'ż':
                return 34;
        }
        return -1;
    }

    /*  ------------------------------------
        Is a prime number?
        If the number is < 2 throw the illegalArgumentException
    */
    public boolean isPrimeNumber(int number){
        if(number < 2){
            throw new IllegalArgumentException("The number should by above 1");
        }

        for(int factor = number / 2; factor > 1; factor--){
            if(number % factor == 0){
                return false;
            }
        }
        return true;
    }

    /*  ------------------------------------
        Find the largest prime.
        If the number is negative or does not have any prime numbers, return -1.
     */
    public int findLargestPrime(int number){
        if(number < 2){
            return -1;
        }
        while (number > 1){
            if(isPrimeNumber(number)){
                return number;
            } else {
                number--;
            }
        }
        return -1;
    }

    /*  ------------------------------------
        Find the largest prime factor of a given number.
        If the number is negative or does not have any prime numbers, return -1.
    */
    public int findLargestPrimeFactor1(int number){
        if(number < 2){
            return -1;
        }
        int toReturn = 2;
        for(int i = 2; number > 1; i++){
            while (number % i == 0){
                toReturn = i;
                number /= i;
            }
        }
        return toReturn;
    }

    public int findLargestPrimeFactor2(int number){
        if(number < 2){
            return -1;
        }
        for(int factor = number / 2; factor > 1; factor--){
            if(number % factor == 0){
                if(isPrimeNumber(factor)){
                    return factor;
                }
            }
        }
        return number;
    }

     /*  ------------------------------------
        Is palindrome?
        The palindrome number is number witch when reversed is equal to the original number, for example: 121, 12321, -1221 etc..
    */
    public boolean isPalindrome1(int number){
        number = Math.abs(number);
        StringBuilder sb = new StringBuilder(number + "").reverse();
        return sb.toString().equals(number + "");
    }

    public boolean isPalindrome2(int number){
       number = Math.abs(number);
       int reverse = 0;
       for(int i = 0, tempNumber = number; i < (number + "").length(); i++, tempNumber /= 10){
           int reminder = tempNumber % 10;
           reverse = (reverse *10) + reminder;
       }
       return number == reverse;
    }

    /*  ------------------------------------
        Is cyclic number? Variable is String. If String number variable isn't number, throw illegalArgumentException.
        The cyclic number is an integer in which cyclic permutations of the digits are successive multiples of the number.
    */

    // solution without math formula
    public boolean isCyclicNumber1(String number){
        BigInteger value;
        try{
            value = new BigInteger(number);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("It's not a number.");
        }
        String[] permutations = new String[number.length()];
        for(int i = 0; i < permutations.length; i++){
            permutations[i] = number.substring(i) + number.substring(0, i);
        }

        String stringFormater = "%0" + number.length() + "d";

        nextMultiply:
        for (int i = 2; i < number.length(); i++){
            BigInteger multiplyNumber  = value.multiply(BigInteger.valueOf(i));
            String stringMultiplyNumber = String.format(stringFormater, multiplyNumber);
            for(String permutation : permutations){
                if(stringMultiplyNumber.equals(permutation)) {
                    continue nextMultiply;
                }
            }
            return false;

        }
        return true;
    }

    // solution with math formula
    public boolean isCyclicNumber2(String number){
        try{
            BigInteger value = new BigInteger(number);
        } catch (NumberFormatException e){
            throw new NumberFormatException("It's not a number.");
        }

        int baseNumber = 10;
        int divider = number.length() + 1;
        if(!isPrimeNumber(divider)){
            return false;
        }
        int reminder =  1;
        StringBuilder calculateNumber = new StringBuilder();
        for(int i = 1; i < divider; i++){
            int currentValueToDivide = reminder * baseNumber;
            int curentDigit = currentValueToDivide / divider;
            reminder = currentValueToDivide % divider;
            calculateNumber.append(curentDigit);
        }
        return number.equals(calculateNumber.toString());
    }


}
