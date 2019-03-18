import utils.TreeNode;

public class No98 {


    private boolean isValidBST(TreeNode root) {
        return dfsBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private boolean dfsBST(TreeNode root, long max, long min){
        if (root == null)
            return true;

        if (root.val >= max || root.val <= min)
            return false;

        return dfsBST(root.left, root.val, min) && dfsBST(root.right, max, root.val);
    }


    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(10);

        System.out.println(new No98().isValidBST(root));

    }
}
