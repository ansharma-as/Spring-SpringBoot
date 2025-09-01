public class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertEnd {
    static Node InsertEnd(Node head, int x){
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
            return head;
        }
        Node current = head;
        while(current.next != null){
            current=current.next;
        }

        current.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = InsertEnd(head, 5);
        head = InsertEnd(head, 1);
        printList(head);
    }

    public static void printList(Node head) {
        if (head == null)
            return;

        System.out.print(head.data + " ");
        printList(head.next);
    }

}