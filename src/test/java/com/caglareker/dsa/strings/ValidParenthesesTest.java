package com.caglareker.dsa.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

    private final ValidParentheses sut = new ValidParentheses();

    @Test
    void simplePair() {
        assertTrue(sut.isValid("()"));
    }

    @Test
    void nested() {
        assertTrue(sut.isValid("([{}])"));
    }

    @Test
    void mismatched() {
        assertFalse(sut.isValid("(]"));
    }

    @Test
    void unclosed() {
        assertFalse(sut.isValid("((("));
    }

    @Test
    void emptyString() {
        assertTrue(sut.isValid(""));
    }
}
