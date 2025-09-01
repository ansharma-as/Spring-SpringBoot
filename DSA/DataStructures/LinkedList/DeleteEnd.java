package DataStructures.LinkedList;

public class DeleteEnd {

    public static void main(String[] args){
        Node head= new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next= second;
        second.next= third;

        head= deleteEnd(head);
        printList(head);
    }

    public static Node deleteEnd(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        return head;
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
