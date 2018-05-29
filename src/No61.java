import java.util.ArrayList;
import java.util.List;

public class No61 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){ val = x; }
    }

//    public ListNode rotateRight(ListNode head, int k) {
//        int n = 1;
//        ListNode rear = head;
//        List<ListNode> pointers = new ArrayList<>();
//        pointers.add(rear);
//        if (head == null)
//            return null;
//
//        while (rear.next != null){
//            pointers.add(rear.next);
//            rear = rear.next;
//            n++;
//        }
//        if (k >= n)
//            k %= n;
//
//        for (int i = 1; i <= k; i++){
//            ListNode next_rear = pointers.get(pointers.size() - i - 1);
//            rear.next = head;
//            head = rear;
//            rear = next_rear;
//            rear.next = null;
//        }
//
//        return head;
//    }
    public ListNode rotateRight(ListNode head, int k) {
        int n = 1;
        int start;
        ListNode startNode = head;
        ListNode rear = head;
        if (head == null)
            return null;

        while (rear.next != null){
            n++;
            rear = rear.next;
        }
        if (k > n)
            k %= n;
        start = n-k-1;
        if (start < 0) return head;
        for (int i = 0; i < start; i++)
            startNode = startNode.next;
        rear.next = head;
        head = startNode.next;
        startNode.next = null;

        return head;

    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        ListNode rotated = new No61().rotateRight(head,2);

        while (rotated != null) {
            System.out.print(rotated.val + " ");
            rotated = rotated.next;
        }
    }
}
