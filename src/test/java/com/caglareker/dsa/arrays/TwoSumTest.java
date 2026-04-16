package com.caglareker.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    private final TwoSum sut = new TwoSum();

    @Test
    void findsSimplePair() {
        assertArrayEquals(new int[] { 0, 1 }, sut.find(new int[] { 2, 7, 11, 15 }, 9));
    }

    @Test
    void findsPairWithDuplicates() {
        assertArrayEquals(new int[] { 0, 1 }, sut.find(new int[] { 3, 3 }, 6));
    }

    @Test
    void returnsEmptyWhenNoPair() {
        assertArrayEquals(new int[0], sut.find(new int[] { 1, 2, 3 }, 10));
    }
}
