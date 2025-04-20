public class SinglyLinkedList {

    private Node head;
    
    private static class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }

    }

    void length(){
        int count = 0;
        Node currNode = head;

        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }

        System.out.println(count);
    }


    void display(){
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.value + " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        

        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.head = new Node(5);
        Node second = new Node(4);
        Node third = new Node(3);
        Node fourth = new Node(2);

        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;

        linkedList.display();
        linkedList.length();

    }
}
