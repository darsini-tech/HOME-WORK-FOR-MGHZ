
package circuly;

class Main {
    public static void main(String[] args) {
        CirculyLinkedList list = new CirculyLinkedList();
        
        list.insertAtHead(20);
        list.insertAtHead(10);
        list.insertAtTail(40);
        list.insertAtMiddle(30, 3);
        
        list.display();
    }
}

