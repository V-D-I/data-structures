package com.vdi.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LinkedListTest {


    @Test
    void push() {
        LinkedList<Integer> ill = new LinkedList<>();
        ill.push(1);

        assertEquals(1, ill.getHead().getData());
        ill.push(3);
        assertEquals(3, ill.getHead().getData());
        ill.push(2);
        assertEquals(2, ill.getHead().getData());
        ill.push(19);
        assertEquals(19, ill.getHead().getData());
        ill.push(22);
        assertEquals(22, ill.getHead().getData());

        assertEquals(5, ill.length());
    }

    @Test
    void pop() {
        LinkedList<Integer> ill = new LinkedList<>();
        ill.push(1);
        ill.push(3);
        ill.push(2);
        ill.push(19);
        ill.push(22);

        assertEquals(22, ill.pop());
        assertEquals(19, ill.pop());
        ill.pop();
        assertEquals(3, ill.pop());

        assertEquals(1, ill.length());
    }

    @Test
    void search() {
        LinkedList<Integer> ill = new LinkedList<>();
        ill.push(1);
        ill.push(3);
        ill.push(2);
        ill.push(19);
        ill.push(22);

        assertEquals(22, ill.search(22));
        assertNull(ill.search(192));
    }
}