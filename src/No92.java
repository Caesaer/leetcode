public class No92 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){ this.val = val; }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        int i = 0;
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        ListNode next_p,
                ins_head = new ListNode(-1),
                ins_rear = null,
                ins_pre_head = new ListNode(-1),
                ins_pre_rear = new ListNode(-1),
                rear;

        dummy.next = head;
        rear = new ListNode(-1);
        while (p != null){
            if (i == m-1)
                ins_head = p;
            if (i >= m && i <= n){
                if (i == m) ins_pre_rear = p;
                if (i == n) ins_pre_head = p;
                next_p = p.next;
                p.next = rear;
                rear = p;
                p = next_p;
                i++;
                continue;
            }
            if (i == n+1)
                ins_rear = p;

            i++;
            p = p.next;
        }

        ins_head.next = ins_pre_head;
        ins_pre_rear.next = ins_rear;

        return dummy.next;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);

        ListNode ln = new No92().reverseBetween(head, 3, 8);
        System.out.println(1);
    }
}
