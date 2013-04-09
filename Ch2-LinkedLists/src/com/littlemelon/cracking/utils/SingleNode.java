package com.littlemelon.cracking.utils;
public class SingleNode<T> {
    public T data;
    public SingleNode<T> next;
    public SingleNode(T data, SingleNode<T> next) {
        this.data = data;
        this.next = next;
    }
}