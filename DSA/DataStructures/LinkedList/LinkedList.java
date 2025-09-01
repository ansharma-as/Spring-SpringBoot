package DataStructures.LinkedList;

public class LinkedList {

    Node head; // head of the list

    // method to add node at the end
    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // method to print the list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // create LinkedList object
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();  // Output: 10 20 30
    }
}
