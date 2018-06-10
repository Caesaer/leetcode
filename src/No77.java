import java.util.ArrayList;
import java.util.List;

public class No77 {

    private List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        helper(0, k, 1, n, new ArrayList<>(), ret);

        return ret;
    }

    private void helper(int pos, int k, int start, int n, List<Integer> num, List<List<Integer>> ret){

        if (pos >= k){
            ret.add(new ArrayList<>(num));
            return;
        }

        for (int i = start; i <= n; i++){
            num.add(i);
            helper(pos+1, k, i+1, n, num, ret);
            num.remove(num.size() - 1);
        }
    }

    public static void main(String[] args){
        List<List<Integer>> list = new No77().combine(4,2);
        System.out.println(list);
    }
}
