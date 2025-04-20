import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; this.next = null; }
}

public class EscapePlan {

    static ListNode split(ListNode head){

        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast != null) {
                slow = slow.next;
            }
        }

        ListNode temp = slow.next;
        slow.next = null;
        return temp;
    }

    static ListNode sort(ListNode head){

        if(head == null || head.next == null) return head;
        ListNode second = split(head);

        head = sort(head);
        second = sort(second);
        return merge(head, second);
    }

    static ListNode merge(ListNode first, ListNode second){

        if (first == null) return second;
        if (second == null) return first;

        if (first.val < second.val) {
            first.next = merge(first.next, second);
            return first;
        }else {
            second.next = merge(first, second.next);
            return second;
        }
    }

    public static ListNode middleNode(ListNode head) {

        ListNode sorted = sort(head);
        ListNode slow = sorted;
        ListNode fast = sorted;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast != null) {
                slow = slow.next;
            }
        }
       
        return slow;
    }
    
    public static ListNode constructLL(int[] arr, int si) {
        if (si == arr.length) return null;
        ListNode head = new ListNode(arr[si]);
        head.next = constructLL(arr, si + 1);
        return head;
    }

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        ListNode head = constructLL(arr, 0);
        ListNode middle_node = middleNode(head);
        if (middle_node != null) {
            System.out.println(middle_node.val);
        } else {
            System.out.println(0);
        }
    }
}
