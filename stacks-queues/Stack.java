public class Stack<E> {
    
    private Node<E> top;
    private int size;
    
    private static class Node<E> {
        E data;
        Node<E> next;
        
        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public Stack() {
        top = null;
        size = 0;
    }
    
    // Push element onto stack
    public void push(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    // Pop element from stack
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        E data = top.data;
        top = top.next;
        size--;
        return data;
    }
    
    // Peek at top element
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return top.data;
    }
    
    // Check if stack is empty
    public boolean isEmpty() {
        return size == 0;
    }
    
    // Get stack size
    public int size() {
        return size;
    }
    
    // Display stack
    public void display() {
        System.out.print("Stack (top to bottom): ");
        Node<E> current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        stack.display();
        System.out.println("Size: " + stack.size());
        
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        
        stack.display();
        System.out.println("Size: " + stack.size());
    }
}
