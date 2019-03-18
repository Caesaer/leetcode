import utils.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class No101 {

    public boolean isSymmetric(TreeNode root) {
        Deque<TreeNode> deque1 = new LinkedList<>();
        Deque<TreeNode> deque2 = new LinkedList<>();
        if (root == null)
            return true;

        deque1.add(root);
        while (!(deque1.isEmpty() && deque2.isEmpty())){
            if (deque1.isEmpty()){
                Deque<TreeNode> tmp = deque1;
                deque1 = deque2;
                deque2 = tmp;
            }

            while (!deque1.isEmpty()){
                TreeNode top = deque1.pop();
                if (top == null)
                    continue;
                deque2.add(top.left);
                deque2.add(top.right);
            }
            if (!isSymContent(deque2))
                return false;
        }
        return true;

    }

    public boolean isSymContent(Deque<TreeNode> deque){
        Deque<TreeNode> tmp = new LinkedList<>(deque);
        while (!tmp.isEmpty()){
            if (tmp.size() == 1)
                break;
            TreeNode topnode = tmp.pollFirst();
            TreeNode tailnode = tmp.pollLast();
            int top = (topnode == null) ? Integer.MAX_VALUE : topnode.val;
            int tail = (tailnode == null) ? Integer.MAX_VALUE : tailnode.val;
            if (top != tail)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(3);

        System.out.println(new No101().isSymmetric(root));

    }
}
