public class DoublyLinkedList {

    private static Node head;

    public static class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node insertAtBeginning(int val) {

        Node newNode = new Node(val);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;

        return newNode;
    }

    static void display() {
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    static void reverse() {
        Node current = head;
        Node prNode = null;

        while (current != null) {
            prNode = current.prev;
            current.prev = current.next;
            current.next = prNode;

            current = current.prev;

        }
        if (prNode != null)
            head = prNode.prev;
    }

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        insertAtBeginning(5);
        insertAtBeginning(10);
        insertAtBeginning(15);
        insertAtBeginning(20);

        display();
        reverse();
        display();

    }
}