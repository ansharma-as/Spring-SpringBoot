package DataStructures.LinkedList;

public class DeleteBegin {

    public static void main(String[] args){
        Node head= new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next= second;
        second.next= third;

        head= deleteHead(head);
        printList(head);
    }

    public static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        }
        return head.next; // java will be handling the memory deallocation garabge collection
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
