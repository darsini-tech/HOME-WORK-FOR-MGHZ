

package linkedlistHomework;

public class LinkedListhomework
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[])
    {
        Node head = null;
        Node temp, newNode;
        newNode = new Node(30);
        newNode.next = head;
        head = newNode;

        newNode = new Node(20);
        newNode.next = head;
        head = newNode;

        newNode = new Node(10);
        newNode.next = head;
        head = newNode;
        newNode = new Node(25);
        temp = head;

        int position = 3;
        for(int i = 1; i < position - 1; i++)
        {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        newNode = new Node(40);
        temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newNode;

        temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}