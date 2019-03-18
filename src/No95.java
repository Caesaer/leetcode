import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class No95 {

    private List<TreeNode> generateTrees(int n) {
        if (n <= 0)
            return new ArrayList<>();

        List<TreeNode> list = geneSubTrees(1,n);
        return list;
    }

    private List<TreeNode> geneSubTrees(int start, int end){
        List<TreeNode> list = new ArrayList<>();

        if (start > end){
            list.add(null);
            return list;
        }

        if (start == end){
            list.add(new TreeNode(start));
            return list;
        }

        for (int i = start; i <= end; i++){
            List<TreeNode> left = geneSubTrees(start, i-1);
            List<TreeNode> right = geneSubTrees(i+1, end);

            for (TreeNode lnode: left)
                for (TreeNode rnode : right){
                    TreeNode root = new TreeNode(i);
                    root.left = lnode;
                    root.right = rnode;
                    list.add(root);
                }
        }

        return list;

    }

    public static void main(String[] args){
        List<TreeNode> list = new No95().generateTrees(3);
        System.out.println(1);

    }
}
