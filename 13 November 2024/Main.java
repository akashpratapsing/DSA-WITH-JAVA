import java.io.Console;
import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head; // head of list
}

class Main {

    // Brute Force
    static int intersectPoint(Node head1, Node head2) {

        Node first = head1;

        while (first != null) {

            Node second = head2;
            while (second != null) {

                if (first == second) {
                    return first.data;
                }
                second = second.next;
            }
            first = first.next;
        }
        return -1;

    }

    // Hashing
    static int intersectPoint2(Node head1, Node head2) {

        HashSet<Node> set = new HashSet<>();

        while (head1 != null) {
            set.add(head1);
            head1 = head1.next;
        }

        while (head2 != null) {
            if (set.contains(head2)) {
                return head2.data;
            }
            head2 = head2.next;
        }

        return -1;
    }

    // Optimized - Using Length Difference 
    static int intersectPoint3(Node head1, Node head2) {

        int len1 = getLength(head1);
        int len2 = getLength(head2);
       
        if (len1 > len2) {
            for (int i = 0; i < len1 - len2; i++) {
                head1 = head1.next;
            }
        } else {
            for (int i = 0; i < len2 - len1; i++) {
                head2 = head2.next;
            }
        }

        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1.data;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return -1;
    }

     static int getLength(Node head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }


    // Using two pointer
    static int intersectPoint4(Node head1, Node head2) {

        Node temp1 = head1;
        Node temp2 = head2;

        if (temp1 == null || temp2 == null) {
            return -1;
        }

        while (temp1 != temp2) {
         
            temp1 = (temp1 != null) ? temp1.next : head2;
            temp2 = (temp2 != null) ? temp2.next : head1;
        }

        return (temp1 != null) ? temp1.data : -1;
    }

    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(30);

        // creation of second list
        Node head2 = new Node(3);
        head2.next = new Node(6);
        head2.next.next = new Node(9);
        head2.next.next.next = head1.next;

        int intersectionPoint = intersectPoint4(head1, head2);

        if (intersectionPoint == -1)
            System.out.print(" No Intersection Point \n");
        else
            System.out.print("Intersection Point: "
                    + intersectionPoint);
    }
}
