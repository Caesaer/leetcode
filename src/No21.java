public class No21 {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(Integer.MIN_VALUE);
        ListNode p = head;

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                p.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else {
                p.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            p = p.next;
        }
        p.next = (l1 == null)? l2 : l1;

        return head.next;
    }
}
