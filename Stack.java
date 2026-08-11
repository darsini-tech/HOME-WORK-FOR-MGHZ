
package stack;

public class Stack {
    
    String[] stack = new String[5];
    int top = -1; 
    void push(String name) {
        if (top == stack.length - 1) {
            System.out.println("Stack is Full");
        } else {
            top++;
            stack[top] = name;
            System.out.println(name + " pushed to stack");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }
    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top student is: " + stack[top]);
        }
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack elements (top to bottom):");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("Arun");
        s.push("Bala");
        s.push("Kumar");
        s.push("Ravi");
        s.push("Suresh");
        s.push("Extra");
        s.display();
        s.peek();
        s.pop();
        s.display();
        s.peek();
    }
}

