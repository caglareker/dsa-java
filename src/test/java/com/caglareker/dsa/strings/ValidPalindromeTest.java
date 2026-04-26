package com.caglareker.dsa.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {

    private final ValidPalindrome sut = new ValidPalindrome();

    @Test
    void trueForSimplePalindrome() {
        assertTrue(sut.isPalindrome("racecar"));
    }

    @Test
    void ignoresCase() {
        assertTrue(sut.isPalindrome("RaceCar"));
    }

    @Test
    void ignoresNonAlphanumeric() {
        assertTrue(sut.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void trueForEmptyString() {
        assertTrue(sut.isPalindrome(""));
    }

    @Test
    void trueForSingleCharacter() {
        assertTrue(sut.isPalindrome("a"));
    }

    @Test
    void trueForStringWithOnlySymbols() {
        assertTrue(sut.isPalindrome(".,"));
    }

    @Test
    void falseForNonPalindrome() {
        assertFalse(sut.isPalindrome("race a car"));
    }
}
