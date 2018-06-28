
public class No82 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p;
        ListNode q = dummy;

        while (q.next != null){
            p = q.next;

            while(p.next != null && p.val == p.next.val)
                p = p.next;
            if (q.next != p)
                q.next = p.next;
            else
                q = q.next;
        }
        return dummy.next;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next.next = new ListNode(5);

        ListNode ret = new No82().deleteDuplicates(head);

    }
}

/*     dummy->1->1->1->2->3->3->4->4->5
       2->5
 */
