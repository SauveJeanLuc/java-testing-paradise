package com.testing.paradise.DSA;

public class QueueDemo {

    int front;
    int rear;
    int[] arr;

    QueueDemo(){
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


}
