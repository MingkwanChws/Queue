package com.company;

public class Main {

    public static void main(String[] args) {
//        MyQueueA queueA = new MyQueueA();
//        queueA.enqueue(1);
//        queueA.enqueue(2);
//        queueA.enqueue(3);
//        queueA.enqueue(4);
//        queueA.enqueue(5);
//        System.out.println(queueA.dequeue());
//        System.out.println(queueA.dequeue());
//        System.out.println(queueA.front());
//        System.out.println(queueA.toString());

        MyQueueL queueL = new MyQueueL();
        queueL.enqueue(1);
        queueL.enqueue(2);
        queueL.enqueue(3);
        queueL.enqueue(4);
        System.out.println(queueL.dequeue());
        System.out.println(queueL.front());
        System.out.println(queueL.toString());

    }
}
