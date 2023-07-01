package com.vdi.linked_list;


public class SortedLinkedList<T extends Comparable<T>> extends LinkedList<T> {

    @Override
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.head == null || this.head.getData().compareTo(data) > 0) {
            newNode.setNextNode(this.head);
            this.head = newNode;
        } else {
            Node<T> iteratingNode = this.head;

            while (iteratingNode.getNextNode() != null) {
                if (iteratingNode.getNextNode().getData().compareTo(data) > 0)
                    break;
                iteratingNode = iteratingNode.getNextNode();
            }

            newNode.setNextNode(iteratingNode.getNextNode());
            iteratingNode.setNextNode(newNode);
        }
        length++;
    }
}
