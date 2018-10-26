package com.endlesspowerskills;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PuzzleTest {

    Puzzle puzzle;

    @Before
    public void init(){
        this.puzzle = new Puzzle();
    }

    @Test
    public void testReverseStringWithAPI() {
        assertEquals("CBA",puzzle.reverseStringWithAPI("ABC"));
        assertEquals("21ba",puzzle.reverseStringWithAPI("ab12"));
        assertEquals("",puzzle.reverseStringWithAPI(""));
        assertEquals("",puzzle.reverseStringWithAPI(null));
        assertEquals("a",puzzle.reverseStringWithAPI("a"));
        assertEquals("aaa",puzzle.reverseStringWithAPI("aaa"));
        assertEquals("aba",puzzle.reverseStringWithAPI("aba"));
        assertEquals("Bbbaa",puzzle.reverseStringWithAPI("aabbB"));
        assertEquals("EDCBA",puzzle.reverseStringWithAPI("ABCDE"));
    }

    @org.junit.Test
    public void testReverseStringWithoutAPI1() {
        assertEquals("CBA",puzzle.reverseStringWithoutAPI1("ABC"));
        assertEquals("21ba",puzzle.reverseStringWithoutAPI1("ab12"));
        assertEquals("",puzzle.reverseStringWithoutAPI1(""));
        assertEquals("",puzzle.reverseStringWithoutAPI1(null));
        assertEquals("a",puzzle.reverseStringWithoutAPI1("a"));
        assertEquals("aaa",puzzle.reverseStringWithoutAPI1("aaa"));
        assertEquals("aba",puzzle.reverseStringWithoutAPI1("aba"));
        assertEquals("Bbbaa",puzzle.reverseStringWithoutAPI1("aabbB"));
        assertEquals("EDCBA",puzzle.reverseStringWithoutAPI1("ABCDE"));
    }

    @org.junit.Test
    public void testReverseStringWithoutAPI2() {
        assertEquals("CBA",puzzle.reverseStringWithoutAPI2("ABC"));
        assertEquals("21ba",puzzle.reverseStringWithoutAPI2("ab12"));
        assertEquals("",puzzle.reverseStringWithoutAPI2(""));
        assertEquals("",puzzle.reverseStringWithoutAPI2(null));
        assertEquals("a",puzzle.reverseStringWithoutAPI2("a"));
        assertEquals("aaa",puzzle.reverseStringWithoutAPI2("aaa"));
        assertEquals("aba",puzzle.reverseStringWithoutAPI2("aba"));
        assertEquals("Bbbaa",puzzle.reverseStringWithoutAPI2("aabbB"));
        assertEquals("EDCBA",puzzle.reverseStringWithoutAPI2("ABCDE"));
    }

    @Test
    public void testReverseStringWithoutAPI3_Recursive() {
        assertEquals("CBA",puzzle.reverseStringWithoutAPI3_Recursive("ABC"));
        assertEquals("21ba",puzzle.reverseStringWithoutAPI3_Recursive("ab12"));
        assertEquals("",puzzle.reverseStringWithoutAPI3_Recursive(""));
        assertEquals("",puzzle.reverseStringWithoutAPI3_Recursive(null));
        assertEquals("a",puzzle.reverseStringWithoutAPI3_Recursive("a"));
        assertEquals("aaa",puzzle.reverseStringWithoutAPI3_Recursive("aaa"));
        assertEquals("aba",puzzle.reverseStringWithoutAPI3_Recursive("aba"));
        assertEquals("Bbbaa",puzzle.reverseStringWithoutAPI3_Recursive("aabbB"));
        assertEquals("EDCBA",puzzle.reverseStringWithoutAPI3_Recursive("ABCDE"));
    }

    @Test
    public void testIsAnagram1() {
        assertTrue(puzzle.isAnagram1("word", "wrdo"));
        assertTrue(puzzle.isAnagram1("mary", "army"));
        assertTrue(puzzle.isAnagram1("stop", "tops"));
        assertTrue(puzzle.isAnagram1("listen", "silent"));
        assertTrue(puzzle.isAnagram1("listen", "SILENT"));
        assertTrue(puzzle.isAnagram1("a", "a"));
        assertTrue(puzzle.isAnagram1("", ""));

        assertFalse(puzzle.isAnagram1("pure", "purr"));
        assertFalse(puzzle.isAnagram1("fill", "fil"));
        assertFalse(puzzle.isAnagram1("b", "bbb"));
        assertFalse(puzzle.isAnagram1("ccc", "ccccccc"));
        assertFalse(puzzle.isAnagram1("sleep", "slep"));

        try {
            puzzle.isAnagram1(null, null);
            fail("expected IllegalArgumentException exception was not occured.");
        } catch(IllegalArgumentException e) {
            //if execution reaches here,
            //it indicates this exception was occured.
            //so we need not handle it.
        }
    }

    @Test
    public void testIsAnagram2() {
        assertTrue(puzzle.isAnagram2("word", "wrdo"));
        assertTrue(puzzle.isAnagram2("mary", "army"));
        assertTrue(puzzle.isAnagram2("stop", "tops"));
        assertTrue(puzzle.isAnagram2("listen", "silent"));
        assertTrue(puzzle.isAnagram2("listen", "SILENT"));
        assertTrue(puzzle.isAnagram2("a", "a"));
        assertTrue(puzzle.isAnagram2("", ""));

        assertFalse(puzzle.isAnagram2("pure", "purr"));
        assertFalse(puzzle.isAnagram2("fill", "fil"));
        assertFalse(puzzle.isAnagram2("b", "bbb"));
        assertFalse(puzzle.isAnagram2("ccc", "ccccccc"));
        assertFalse(puzzle.isAnagram2("sleep", "slep"));

        try {
            puzzle.isAnagram2(null, null);
            fail("expected IllegalArgumentException exception was not occured.");
        } catch(IllegalArgumentException e) {
            //if execution reaches here,
            //it indicates this exception was occured.
            //so we need not handle it.
        }
    }

    @Test
    public void testIsAnagram3() {
        assertTrue(puzzle.isAnagram3("word", "wrdo"));
        assertTrue(puzzle.isAnagram3("mary", "army"));
        assertTrue(puzzle.isAnagram3("stop", "tops"));
        assertTrue(puzzle.isAnagram3("listen", "silent"));
        assertTrue(puzzle.isAnagram3("listen", "SILENT"));
        assertTrue(puzzle.isAnagram3("a", "a"));
        assertTrue(puzzle.isAnagram3("", ""));
        assertTrue(puzzle.isAnagram3("żółć", "ćółż"));

        assertFalse(puzzle.isAnagram3("pure", "purr"));
        assertFalse(puzzle.isAnagram3("fill", "fil"));
        assertFalse(puzzle.isAnagram3("b", "bbb"));
        assertFalse(puzzle.isAnagram3("ccc", "ccccccc"));
        assertFalse(puzzle.isAnagram3("sleep", "slep"));
        assertFalse(puzzle.isAnagram3("żółć", "ćółże"));

        try {
            puzzle.isAnagram3(null, null);
            fail("expected IllegalArgumentException exception was not occured.");
        } catch(IllegalArgumentException e) {
            //if execution reaches here,
            //it indicates this exception was occured.
            //so we need not handle it.
        }
    }

    @Test
    public void testIsPrimeNumber() {
        assertTrue(puzzle.isPrimeNumber(2));
        assertTrue(puzzle.isPrimeNumber(5));
        assertTrue(puzzle.isPrimeNumber(23));
        assertTrue(puzzle.isPrimeNumber(127));
        assertTrue(puzzle.isPrimeNumber(15487019));

        assertFalse(puzzle.isPrimeNumber(10));
        assertFalse(puzzle.isPrimeNumber(21));
        assertFalse(puzzle.isPrimeNumber(159));
        assertFalse(puzzle.isPrimeNumber(15487017));

        try {
            puzzle.isPrimeNumber(-5);
            fail("expected IllegalArgumentException exception was not occured.");
        } catch(IllegalArgumentException e) {
            //if execution reaches here, it indicates this exception occured.
            //this is the expected result.
        }
    }

    @Test
    public void testFindLargestPrime() {
        assertEquals(19, puzzle.findLargestPrime(21));
        assertEquals(211, puzzle.findLargestPrime(217));
        assertEquals(541, puzzle.findLargestPrime(542));
        assertEquals(-1, puzzle.findLargestPrime(0));
        assertEquals(105929, puzzle.findLargestPrime(105942));
    }

    @Test
    public void testFindLargestPrimeFactor1() {
        assertEquals(7, puzzle.findLargestPrimeFactor1(21));
        assertEquals(31, puzzle.findLargestPrimeFactor1(217));
        assertEquals(5, puzzle.findLargestPrimeFactor1(45));
        assertEquals(-1, puzzle.findLargestPrimeFactor1(1));
        assertEquals(105929, puzzle.findLargestPrimeFactor1(105929));
        assertEquals(105929, puzzle.findLargestPrimeFactor1(211858));
    }

    @Test
    public void testFindLargestPrimeFactor2() {
        assertEquals(7, puzzle.findLargestPrimeFactor2(21));
        assertEquals(31, puzzle.findLargestPrimeFactor2(217));
        assertEquals(5, puzzle.findLargestPrimeFactor2(45));
        assertEquals(-1, puzzle.findLargestPrimeFactor2(1));
        assertEquals(105929, puzzle.findLargestPrimeFactor2(105929));
        assertEquals(105929, puzzle.findLargestPrimeFactor2(211858));
    }

    @Test
    public void testIsPalindrome1() {
        assertTrue(puzzle.isPalindrome1(121));
        assertTrue(puzzle.isPalindrome1(-1221));
        assertTrue(puzzle.isPalindrome1(12321));
        assertTrue(puzzle.isPalindrome1(-12721));
        assertTrue(puzzle.isPalindrome1(66));
        assertTrue(puzzle.isPalindrome2(336696633));

        assertFalse(puzzle.isPalindrome1(12));
        assertFalse(puzzle.isPalindrome1(21));
        assertFalse(puzzle.isPalindrome1(159));
        assertFalse(puzzle.isPalindrome1(15487017));
    }

    @Test
    public void testIsPalindrome2() {
        assertTrue(puzzle.isPalindrome2(121));
        assertTrue(puzzle.isPalindrome2(-1221));
        assertTrue(puzzle.isPalindrome2(12321));
        assertTrue(puzzle.isPalindrome2(-12721));
        assertTrue(puzzle.isPalindrome2(66));
        assertTrue(puzzle.isPalindrome2(336696633));

        assertFalse(puzzle.isPalindrome2(12));
        assertFalse(puzzle.isPalindrome2(21));
        assertFalse(puzzle.isPalindrome2(159));
        assertFalse(puzzle.isPalindrome2(15487017));
    }

    @Test
    public void testIsCyclicNumber1() {
        assertTrue(puzzle.isCyclicNumber1("142857"));
        assertTrue(puzzle.isCyclicNumber1("0588235294117647"));
        assertTrue(puzzle.isCyclicNumber1("052631578947368421"));
        assertTrue(puzzle.isCyclicNumber1("0434782608695652173913"));
        assertTrue(puzzle.isCyclicNumber1("0344827586206896551724137931"));
        assertTrue(puzzle.isCyclicNumber1("0212765957446808510638297872340425531914893617"));
        assertTrue(puzzle.isCyclicNumber1("0169491525423728813559322033898305084745762711864406779661"));
        assertTrue(puzzle.isCyclicNumber1("016393442622950819672131147540983606557377049180327868852459"));
        assertTrue(puzzle.isCyclicNumber1("010309278350515463917525773195876288659793814432989690721649484536082474226804123711340206185567"));

        assertFalse(puzzle.isCyclicNumber1("010309278350515463917525773195876288659793814432989690721649484536082474226804123711340206185568"));
        assertFalse(puzzle.isCyclicNumber1("333"));
        assertFalse(puzzle.isCyclicNumber1("142856"));
        assertFalse(puzzle.isCyclicNumber1("076923"));
        assertFalse(puzzle.isCyclicNumber1("07692399"));

        try {
            puzzle.isCyclicNumber1("0934434O");
            fail("expected IllegalArgumentException exception was not occured.");
        } catch(IllegalArgumentException e) {
            //if execution reaches here, it indicates this exception occured.
            //this is the expected result.
        }
    }

    @Test
    public void testIsCyclicNumber2() {
        assertTrue(puzzle.isCyclicNumber2("142857"));
        assertTrue(puzzle.isCyclicNumber2("0588235294117647"));
        assertTrue(puzzle.isCyclicNumber2("052631578947368421"));
        assertTrue(puzzle.isCyclicNumber2("0434782608695652173913"));
        assertTrue(puzzle.isCyclicNumber2("0344827586206896551724137931"));
        assertTrue(puzzle.isCyclicNumber2("0212765957446808510638297872340425531914893617"));
        assertTrue(puzzle.isCyclicNumber2("0169491525423728813559322033898305084745762711864406779661"));
        assertTrue(puzzle.isCyclicNumber2("016393442622950819672131147540983606557377049180327868852459"));
        assertTrue(puzzle.isCyclicNumber2("010309278350515463917525773195876288659793814432989690721649484536082474226804123711340206185567"));

        assertFalse(puzzle.isCyclicNumber2("010309278350515463917525773195876288659793814432989690721649484536082474226804123711340206185568"));
        assertFalse(puzzle.isCyclicNumber2("333"));
        assertFalse(puzzle.isCyclicNumber2("142856"));
        assertFalse(puzzle.isCyclicNumber2("076923"));
        assertFalse(puzzle.isCyclicNumber2("07692399"));

        try {
            puzzle.isCyclicNumber2("0934434O");
            fail("expected IllegalArgumentException exception was not occured.");
        } catch(IllegalArgumentException e) {
            //if execution reaches here, it indicates this exception occured.
            //this is the expected result.
        }
    }

    @Test
    public void testFindMissingElement1() {
        assertEquals(2, puzzle.findMissingElement1(new int[]{0,1,3,4}));
        assertEquals(5, puzzle.findMissingElement1(new int[]{0,1,2,3,4}));
        assertEquals(0, puzzle.findMissingElement1(new int[]{5,1,2,3,4}));
        assertEquals(-1, puzzle.findMissingElement1(new int[]{0,-1,2,3,4}));
        assertEquals(-1, puzzle.findMissingElement1(new int[]{0,1,2,3,6}));
    }

    @Test
    public void testFindMissingElement2() {
        assertEquals(2, puzzle.findMissingElement2(new int[]{0,1,3,4}));
        assertEquals(5, puzzle.findMissingElement2(new int[]{0,1,2,3,4}));
        assertEquals(0, puzzle.findMissingElement2(new int[]{5,1,2,3,4}));
        assertEquals(-1, puzzle.findMissingElement2(new int[]{0,-1,2,3,4}));
        assertEquals(-1, puzzle.findMissingElement2(new int[]{0,1,2,3,6}));
    }
}