import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        TreeNode rear = root;
        TreeNode cur = root;
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<TreeNode> layer = new ArrayList<>();

        q.add(root);
        layer.add(root);
        res.add(nodetoInt(layer));

        while (q.size() > 0){
            cur = q.poll();

            if (cur.left != null) q.add(cur.left);
            if (cur.right != null) q.add(cur.right);

            if (cur == rear){
                layer = new ArrayList<>(q);
                rear = (layer.size() == 0)? null : layer.get(layer.size()-1);
                if (layer.size() != 0)
                    res.add(nodetoInt(layer));
            }
        }
        return res;
    }

    public List<Integer> nodetoInt(List<TreeNode> nodes){
        List<Integer> tmp = new ArrayList<>();
        for (TreeNode node: nodes)
            tmp.add(node.val);

        return tmp;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
       // root.right = new TreeNode(7);
        root.left.left = new TreeNode(3);
        // root.left.right =
        root.left.left.left = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);

        List<List<Integer>> ret = new No102().levelOrder(root);
        System.out.println(ret);
    }
}
