class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertBegin {
    static Node InsertBegin(Node head, int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = InsertBegin(head, 5);
        head = InsertBegin(head, 1);
        printList(head);
    }

    public static void printList(Node head) {
        if (head == null)
            return;

        System.out.print(head.data + " ");
        printList(head.next);
    }

}
