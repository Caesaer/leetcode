import java.util.ArrayList;
import java.util.List;

public class No78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        ret.add(new ArrayList<>());
        dfsHelper(nums, ret, list, 0);

        return ret;
    }

    public void dfsHelper(int[] nums, List<List<Integer>> ret, List<Integer> sub, int pos){

        for (int i = pos; i < nums.length; i++){
            sub.add(nums[i]);
            ret.add(new ArrayList<>(sub));
            dfsHelper(nums,ret,sub,i+1);
            sub.remove(sub.size() - 1);
        }
    }

    public static void main(String[] args){
        int[] nums = {1,2,3};

        System.out.println(new No78().subsets(nums));
    }
}
