import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No40 {
    private List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> solved = new ArrayList<>();
        List<Integer> unsolved = new ArrayList<>();
        boolean[] picked = new boolean[candidates.length];
        searchNext(candidates, target, solved, unsolved, 0);

        return solved;
    }

    private void searchNext(int[] candidates, int target, List<List<Integer>> solved,
                            List<Integer> unsolved, int nexti){
        if (target == 0){
            List<Integer> tmp = new ArrayList<>(unsolved);
            solved.add(tmp);
            return;
        }

        for (int i = nexti; i < candidates.length && target >= candidates[i]; i++){
            if (i > nexti && candidates[i] == candidates[i-1])
                continue;
            unsolved.add(candidates[i]);
            searchNext(candidates, target - candidates[i], solved, unsolved, i+1);
            unsolved.remove(unsolved.size() - 1);
        }
    }

    public static void main(String[] args){
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ret = new No40().combinationSum2(candidates, target);
        System.out.println(ret);
    }
}


/*
*
*  1,1,2,5,6,7,10  target = 8
*
*
* */