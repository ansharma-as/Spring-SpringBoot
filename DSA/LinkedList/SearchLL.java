class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class SearchLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        int key = 20;
        int found = search(head, key);
        System.out.println("Element " + key +" in index " + found + " in the linked list.");
    }

    public static int search(Node head, int key) {
        Node current = head;
        for (int i = 0; current != null; i++) {
            if (current.data == key) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }
}
