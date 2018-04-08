import java.util.ArrayList;
import java.util.List;

public class No19 {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        List<ListNode> record = new ArrayList<>();
        int pos;

        while (p != null){
            record.add(p);
            p = p.next;
        }
        if (record.size() == 1)
            return null;
        pos = record.size() - n;
        if (pos == 0) {
            head = null;
            return record.get(1);
        }
        else if (pos == record.size() - 1)
            record.get(pos - 1).next = null;
        else
            record.get(pos-1).next = record.get(pos+1);

        return head;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode ret = new No19().removeNthFromEnd(head,1);
    }
}
