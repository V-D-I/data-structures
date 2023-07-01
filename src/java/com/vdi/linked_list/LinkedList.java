package com.vdi.linked_list;

/*
 * Primitive single-threaded representation of the linked list's work
 * */
public class LinkedList<T> {
    protected Node<T> head;
    protected int length;

    public LinkedList() {
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(head);
        this.head = newNode;
        length++;
    }

    public T pop() {
        T headData = this.head.getData();
        this.head = this.head.getNextNode();

        length--;
        return headData;
    }

    public T search(T dataToSearch) {
        Node<T> iteratingNode = this.head;
        while (iteratingNode != null) {
            if (iteratingNode.getData().equals(dataToSearch)) {
                return iteratingNode.getData();
            }
            iteratingNode = iteratingNode.getNextNode();
        }
        return null;
    }

    public int length() {
        return length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LinkedList: [");
        Node<T> iteratingNode = this.head;
        while (iteratingNode != null) {
            sb
                    .append(iteratingNode.toString())
                    .append(", ");
            iteratingNode = iteratingNode.getNextNode();
        }
        sb.append("]");
        return sb.toString();
    }

    public Node<T> getHead() {
        return this.head;
    }

}
