package com.caglareker.dsa.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseLinkedListTest {

    private final ReverseLinkedList sut = new ReverseLinkedList();

    @Test
    void reversesThreeNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode reversed = sut.reverse(head);
        assertEquals(3, reversed.val);
        assertEquals(2, reversed.next.val);
        assertEquals(1, reversed.next.next.val);
        assertNull(reversed.next.next.next);
    }

    @Test
    void handlesSingleNode() {
        ListNode head = new ListNode(1);
        ListNode reversed = sut.reverse(head);
        assertEquals(1, reversed.val);
        assertNull(reversed.next);
    }

    @Test
    void handlesEmpty() {
        assertNull(sut.reverse(null));
    }
}
