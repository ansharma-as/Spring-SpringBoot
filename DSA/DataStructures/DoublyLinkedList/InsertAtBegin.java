
package DataStructures.DoublyLinkedList;

public class InsertAtBegin {
    static Node head; 

    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.prev = head;
        head.next.next.prev = head.next;

        printList(); // before insertion

        insertBegin(40);

        printList(); // after insertion
    }

    public static void insertBegin(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    static void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
