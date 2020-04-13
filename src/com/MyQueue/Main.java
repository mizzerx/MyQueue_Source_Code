package com.MyQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyQueue queue = new MyQueue();
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);
        queue.Print();
//        queue.Dequeue();
//        queue.Dequeue();
//        queue.Dequeue();
        System.out.println(queue.IsEmpty());
        System.out.println(queue.rear.data);
        System.out.println(queue.front.data);
        queue.Print();
    }
}
