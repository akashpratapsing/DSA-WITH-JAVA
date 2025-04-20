public class DoublyLinkedList {

    private Node head;
    private int size = 0;

    public class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    public void size() {
        System.out.println(size);
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.previous = null;
        if (head != null) {
            head.previous = node;
        }
        head = node;

        size++;
    }

    public void insertLast(int value) {
        if (head == null) {
            insertFirst(value);
        } else {
            Node node = new Node(value);
            Node prevNode = getNode(size - 1);
            prevNode.next = node;
            node.previous = prevNode;
            node.next = null;
        }

        size++;
    }

    public Node getNode(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " <--> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverce() {
        Node temp = getNode(size - 1);

        while (temp != null) {
            System.out.print(temp.value + " <--> ");
            temp = temp.previous;
        }   
        System.out.println("START");
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertLast(45);
        list.insertLast(75);
        list.insertLast(35);
        list.insertLast(85);
        list.insertLast(95);

        list.display();
        list.displayReverce();

    }
}
