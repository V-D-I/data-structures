package com.vdi.linked_list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortedLinkedListTest {

    @Test
    void push() {
        LinkedList<Integer> sill = new SortedLinkedList<>();
        sill.push(5);
        sill.push(2);
        sill.push(1);
        sill.push(22);
        sill.push(11);
        sill.push(44);
        sill.push(102);

        assertEquals(7, sill.length());

        for (Integer expected : List.of(1, 2, 5, 11, 22, 44, 102)) {
            assertEquals(expected, sill.pop());
        }
        assertEquals(0, sill.length());
    }
}