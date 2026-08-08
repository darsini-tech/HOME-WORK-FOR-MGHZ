
package circuly;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class CirculyLinkedList {
    Node head = null;
    void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
            return;
        }

        Node tail = head.prev;
        newNode.next = head;
        newNode.prev = tail;
        head.prev = newNode;
        tail.next = newNode;
        head = newNode;
    }
    void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
            return;
        }

        Node tail = head.prev;
        newNode.next = head;
        newNode.prev = tail;
        tail.next = newNode;
        head.prev = newNode;
    }
    void insertAtMiddle(int data, int position) {
        if (position == 1) {
            insertAtHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }

        Node nextNode = current.next;
        newNode.next = nextNode;
        newNode.prev = current;
        current.next = newNode;
        nextNode.prev = newNode;
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);

        System.out.println("(HEAD)");
    }
}
