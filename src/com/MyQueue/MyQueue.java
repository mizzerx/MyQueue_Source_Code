package com.MyQueue;

public class MyQueue {
    Node rear = null;
    Node front = null;

    public void Enqueue (int data) {
        if (front == null && rear == null) {
            front = new Node(data);
            rear = front;
            return;
        }
        Node temp = rear;
        rear.next = new Node(data);
        rear = rear.next;
        rear.prev = temp;
    }

    public void Dequeue () {
        if (front == null) return;
        front = front.next;
        if (front == null) rear = null;
    }

    public boolean IsEmpty () {
        if (front == null && rear == null) return true;
        return false;
    }

    public void Print () {
        Node current = rear;
        System.out.print("[");
        if (current == null) {
            System.out.println("]");
            return;
        }
        while (current.prev != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.print(current.data);
        System.out.println("]");
    }
}
