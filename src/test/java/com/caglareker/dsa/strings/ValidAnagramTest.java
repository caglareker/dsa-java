package com.caglareker.dsa.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {

    private final ValidAnagram sut = new ValidAnagram();

    @Test
    void trueForAnagrams() {
        assertTrue(sut.isAnagram("anagram", "nagaram"));
    }

    @Test
    void falseWhenLettersDiffer() {
        assertFalse(sut.isAnagram("rat", "car"));
    }

    @Test
    void falseWhenLengthsDiffer() {
        assertFalse(sut.isAnagram("abc", "abcd"));
    }
}
