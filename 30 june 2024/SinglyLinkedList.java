public class SinglyLinkedList {

    private Node head;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Travese through Singly Linkedlist

    public void display() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Function to find length if Singly Linkedlist

    public int length() {
        Node curr = head;
        int count = 0;

        while (curr != null) {
            curr = curr.next;
            count++;
        }
        return count;
    }

    // Insert at the start position of likedlist

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end position of linkedlist

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Insert at specific position

    public void insert(int position, int data) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {

            Node prevNode = head;
            int count = 1;

            while (prevNode != null && count < position - 1) {
                prevNode = prevNode.next;
                count++;
            }

            if (prevNode == null) {
                System.out.println("Position is Beyond the length of list");
                return;
            }

            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }

    public static void main(String[] args) {

        // Creation of Singly Linkedlist

        SinglyLinkedList ll = new SinglyLinkedList();
        ll.head = new Node(5);
        Node second = new Node(41);
        Node third = new Node(47);
        Node fourth = new Node(4);

        ll.head.next = second;
        second.next = third;
        third.next = fourth;

        ll.display();
        int len = ll.length();
        System.out.println("lenght of this linkedlist is " + len);
        ll.insertAtStart(89);
        ll.display();
        ll.insertAtEnd(85);
        ll.display();
        ll.insert(4, 55);
        ll.display();
        ll.insert(8, 58);
        ll.display();
        ll.insert(1, 7);
        ll.display();
        ll.insert(15, 77);

    }
}