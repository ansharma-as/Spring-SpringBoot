public class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertPosition {
    static Node InsertPos(Node head, int x ,int pos){
        Node newNode = new Node(x);
        if(pos == 0){
            newNode.next = head;
            return newNode;
        }
        Node current = head;
        for (int i=0 ; i<pos-1 && current != null ; i++){
            current=current.next;
        }
        if (current == null) {
        System.out.println("Position out of bounds. No insertion performed.");
        return head;
    }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head = InsertPos(head, 5, 1);
        head = InsertPos(head, 1, 0);
        printList(head);
    }

    public static void printList(Node head) {
        if (head == null)
            return;

        System.out.print(head.data + " ");
        printList(head.next);
    }

}