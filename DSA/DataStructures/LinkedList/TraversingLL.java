package DataStructures.LinkedList;

public class TraversingLL {
    public static void main(String[] args){
        Node head = new Node(10);
        // head.next = new Node(20);
        // head.next.next = new Node(30);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;

        printList(head);
        System.out.println("Reverse Print:");
        rPrint(head);

    }

    static void printList(Node head) {
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    static void rPrint(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        rPrint(head.next);
    }
}