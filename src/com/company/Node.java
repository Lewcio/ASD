package com.company;

public class Node {
    private String key;
    private Object element;
    private Node prev, next;

    public Node(String key, Object element, Node prev, Node next) {
        this.key = key;
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getKey() {
        return key;
    }

    public Object getElement() {
        return element;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }

    public void setPrev() {
    }
}
