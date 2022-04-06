package com.testing.paradise.DSA;

class Queue {

    int front;
    int rear;
    int[] arr;

    Queue(){
        front = rear = -1;
        arr = new int[10];
    }

    void enqueue(int a){
        if(rear == arr.length-1)
            System.out.println("overflow");
        else
            arr[++rear] = a;

        if(front==-1)
            front++;
    }

    int dequeue(){
        int x = -1;
            if(front == -1)
                System.out.println("underflow");
            else
                x = arr[front++];
            if(rear == 0)
                rear--;
            return x;
    }

    void display(){
        for(int i = front; i<=rear; i++)
            System.out.print(arr[i]+"");

        System.out.println();
    }

}

public class QueueDemo{

    public static void main(String[] args) {
        Queue embeddedQueue = new Queue();
        embeddedQueue.enqueue(34);
        embeddedQueue.enqueue(45);
        embeddedQueue.display();
        embeddedQueue.dequeue();
        embeddedQueue.display();
    }
}
