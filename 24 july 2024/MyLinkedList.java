public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    // Prints the size of linked list
    public void size() {
        System.out.println(size);
    }

    // Inserts node at first index
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
        size++;
    }

    // Inserts node at last index
    public void insertLast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            insertFirst(value);
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // Traverse and Prints the linked list
    void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to get the node via index
    public Node getNode(int index) {
        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        return current.next;
    }

    // Inserts a Node at given index
    public void insertAt(int index, int value) {

        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        // Node node = new Node(value);
        Node prev = getNode(index - 1);
        // node.next = prev.next;
        Node node = new Node(value, prev.next);
        prev.next = node;

    }

    // Deletes The Node at first index
    public int deleteFirst() {
        if (head == null) {
            return -1;
        }

        Node temp = head;
        head = head.next;

        return temp.value;
    }

    // Deletes The node at last Index
    public int deleteLast() {

        if (head == null) {
            return -1;
        }
        if (head.next == null) {

            Node temp = head;
            head = null;
            return temp.value;

        } else {

            Node prev = getNode(size - 2);
            Node temp = prev.next;
            prev.next = null;
            return temp.value;
        }
    }

    // Deletes The Node at given Index
    public int deleteAt(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = getNode(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;

        return temp.value;
    }

    // Returns the value at given index
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node idx = getNode(index);
        return idx.value;
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertLast(5);
        list.insertFirst(45);
        list.insertFirst(7);
        list.insertFirst(77);
        list.insertFirst(85);

        list.display();
        list.size();

        list.insertAt(5, 777);

        list.display();
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());

        System.out.println(list.deleteAt(2));

        list.display();

        System.out.println(list.get(8));

        // System.out.println(list.getNode(3));

    }

}