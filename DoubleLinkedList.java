
package doubly;

class DoublyLinkedlist{
 
    int data; 
    DoublyLinkedlist prev; 
    DoublyLinkedlist next; 

    DoublyLinkedlist(int d) { 
        data = d; 
        prev = null; 
        next = null; 
    } 
}
class DoublyLinkedListManager { 
    DoublyLinkedlist head = null; 

    public void insertAtEnd(int data) { 
        DoublyLinkedlist newNode = new DoublyLinkedlist(data); 
        if (head == null) { 
            head = newNode; 
            return; 
        } 
        DoublyLinkedlist temp = head; 
        while (temp.next != null) { 
            temp = temp.next; 
        } 
        temp.next = newNode; 
        newNode.prev = temp; 
    } 

    public void insertAtPosition(int data, int position) { 
        DoublyLinkedlist newNode = new DoublyLinkedlist(data); 
        if (position == 1) { 
            newNode.next = head; 
            if (head != null) { 
                head.prev = newNode; 
            } 
            head = newNode; 
            return; 
        } 
        DoublyLinkedlist temp = head; 
        int count = 1; 
        while (temp != null && count < position - 1) { 
            temp = temp.next; 
            count++; 
        } 
        if (temp != null) { 
            newNode.next = temp.next; 
            newNode.prev = temp; 
            if (temp.next != null) { 
                temp.next.prev = newNode; 
            } 
            temp.next = newNode; 
        } 
    } 

    public void display() { 
        DoublyLinkedlist temp = head; 
        while (temp != null) { 
            System.out.print(temp.data + " <-> "); 
            temp = temp.next; 
        } 
        System.out.println("NULL"); 
    } 
}

