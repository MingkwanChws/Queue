package com.company;

public class MyQueueA {
    int MAX_SIZE = 100;
    int queue[] = new int[MAX_SIZE];
    int head = 0;
    int tail = 0;

    public void enqueue(int d) {
        queue[tail] = d;
        tail = (tail + 1) % MAX_SIZE;
    }

    public int dequeue() {
        int d = queue[head];
        head = (head + 1) % MAX_SIZE;
        return d;
    }

    public int front() {
        return queue[head];
    }

    public boolean isFull() {
        return ((tail + 1) % MAX_SIZE) == head;
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public String toString() {
        int i = 0;
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        while (head != tail - 1) {
            sb.append(queue[head]);
            sb.append(",");
            head = (head + 1) % MAX_SIZE;
        }
        if (head == tail - 1) sb.append(queue[head]);
            sb.append("]");
        return sb.toString();
    }
}
