
package linkedlistHomework;


public class NameLinkedlist {

    static class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[])
    {
        Node head = null;
        Node temp, newNode;

        newNode = new Node("Ravi");
        newNode.next = head;
        head = newNode;

        newNode = new Node("Kumar");
        newNode.next = head;
        head = newNode;

        newNode = new Node("Arun");
        newNode.next = head;
        head = newNode;

        newNode = new Node("Vijay");
        temp = head;

        int position = 3;

        for(int i = 1; i < position - 1; i++)
        {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        newNode = new Node("Ajay");
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

