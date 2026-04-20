package com.caglareker.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    private final ContainsDuplicate sut = new ContainsDuplicate();

    @Test
    void returnsTrueWhenDuplicateExists() {
        assertTrue(sut.check(new int[] { 1, 2, 3, 1 }));
    }

    @Test
    void returnsFalseForUniqueArray() {
        assertFalse(sut.check(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    void returnsFalseForEmptyArray() {
        assertFalse(sut.check(new int[0]));
    }
}
