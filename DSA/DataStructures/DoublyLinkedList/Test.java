class Node{
    int data;
    Node next;
    Node prev;

    Node(int x){
        data=x;
        next=null;
        prev=null;
    }
}

public class Test {
    public static void main(String[] args){
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        // Print the list
        printList(head);
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
