
package queue;

public class Queue 
{ 
    String[] queue = new String[5];
    int front = -1;
    int rear = -1;
    void enqueue(String name)
    {
        if (rear == queue.length - 1) 
        {
            System.out.println("Queue is Full");
        } else {
            if (front == -1)
            {
                front = 0; 
            }
            rear++;
            queue[rear] = name;
            System.out.println(name + " added to queue");
        }
    }
    void dequeue()
    {
        if (front == -1 || front > rear)
        {
            System.out.println("Queue is Empty");
        } else 
        {
            System.out.println(queue[front] + " removed from queue");
            front++;
        }
    }
    void peek()
    {
        if (front == -1 || front > rear)
        {
            System.out.println("Queue is Empty");
        } 
        else
        {
            System.out.println("Front student is: " + queue[front]);
        }
    }
    void display()
    {
        if (front == -1 || front > rear) 
        {
            System.out.println("Queue is Empty");
        } 
        else
        {
            System.out.println("Queue elements (front to rear):");
            for (int i = front; i <= rear; i++)
            {
                System.out.println(queue[i]);
            }
        }
    }

    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enqueue("Arun");
        q.enqueue("Bala");
        q.enqueue("Kumar");
        q.enqueue("Ravi");
        q.enqueue("Suresh");
        q.enqueue("Extra");
        q.display();
        q.dequeue();
        q.peek();
        q.display();
    }
}