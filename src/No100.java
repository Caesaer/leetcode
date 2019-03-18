import utils.TreeNode;

public class No100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return syncdfs(p, q);
    }

    private boolean syncdfs(TreeNode p, TreeNode q){
        if (p == q && p == null)
            return true;

        if (p == null || q == null || p.val != q.val )
            return false;

        return syncdfs(p.left, q.left) && syncdfs(p.right, q.right);
    }

    public static void main(String[] args){
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);

        p.left = new TreeNode(2);


        q.right = new TreeNode(2);

        System.out.println(new No100().isSameTree(p,q));
    }
}
