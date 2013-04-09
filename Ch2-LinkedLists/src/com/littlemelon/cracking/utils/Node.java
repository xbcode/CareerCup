package com.littlemelon.cracking.utils;
public class Node<E> {
    public E data;
    public Node<E> next;
    public Node<E> previous;
    public Node(Node<E> previous, E data, Node<E> next) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }
}