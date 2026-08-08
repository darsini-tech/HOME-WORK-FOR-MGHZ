
package doubly;


public class Main {
     public static void main(String[] args) { 
        DoublyLinkedListManager list = new DoublyLinkedListManager(); 
        
        list.insertAtEnd(10); 
        list.insertAtEnd(20); 
        list.insertAtEnd(40); 
        list.insertAtEnd(50); 
        list.insertAtPosition(30, 3); 
        
        list.display(); 
}
}

