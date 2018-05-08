import java.util.ArrayList;
import java.util.List;

public class No39 {
    private List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> solved = new ArrayList<>();
        List<Integer> unsolved = new ArrayList<>();

        dfs(candidates, solved, unsolved, 0, target);
        return solved;
    }

    private void dfs(int[] candidates, List<List<Integer>> solved, List<Integer> unsolved, int nexti, int target){
        if (target == 0){
            List<Integer> tmp = new ArrayList<>(unsolved);
            solved.add(tmp);
            return;
        }

        if (target < 0)
            return;

        for (int i = nexti; i < candidates.length; i++){
            unsolved.add(candidates[i]);
            dfs(candidates, solved, unsolved, i, target - candidates[i]);
            unsolved.remove(unsolved.size() - 1);
        }
    }


    public static void main(String[] args){
        int[] candidates = {2,3,5};
        int target = 8;
        List<List<Integer>> ret = new No39().combinationSum(candidates, target);
        System.out.println(ret);
    }
}
