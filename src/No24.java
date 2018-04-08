public class No24 {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;

        while (p.next != null && p.next.next != null){
            ListNode first = p.next;
            ListNode second = p.next.next;
            first.next = second.next;
            p.next = second;
            p.next.next = first;

            p = p.next.next;
        }
        return dummy.next;
    }

    /* 1 -- 2 -- 3 -- 4 -- 5
       2 -- 1 -- 4 -- 3

     */

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        new No24().swapPairs(head);

    }

}
