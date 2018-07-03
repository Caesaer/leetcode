
public class No86 {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode sh = new ListNode(-1);
        ListNode lh = new ListNode(-1);
        ListNode p = head;

        ListNode sp = sh, lp = lh;
        while (p != null){
            if (p.val < x){
                sp.next = p;
                sp = sp.next;
            }
            else {
                lp.next = p;
                lp = lp.next;
            }
            p = p.next;
        }
        sp.next = lh.next;
        lp.next = null;

        return sh;
    }


    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        ListNode ret = new No86().partition(head,3);
    }
}
