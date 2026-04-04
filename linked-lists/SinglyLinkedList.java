public class SinglyLinkedList<E> {
    
    private Node<E> head;
    private int size;
    
    private static class Node<E> {
        E data;
        Node<E> next;
        
        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public SinglyLinkedList() {
        head = null;
        size = 0;
    }
    
    // Insert at beginning
    public void insertAtBeginning(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    // Insert at end
    public void insertAtEnd(E data) {
        Node<E> newNode = new Node<>(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    
    // Delete first occurrence
    public boolean delete(E data) {
        if (head == null) return false;
        
        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }
        
        Node<E> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    // Display the list
    public void display() {
        Node<E> current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // Get size
    public int getSize() {
        return size;
    }
    
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);
        
        list.display();
        System.out.println("Size: " + list.getSize());
        
        list.delete(20);
        list.display();
        System.out.println("Size: " + list.getSize());
    }
}
