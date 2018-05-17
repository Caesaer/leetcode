import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No47 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ret = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        Arrays.sort(nums);
        findNext(nums, used, list, ret);

        return ret;
    }

    private void findNext(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> ret){
        if (list.size() == nums.length){
            ret.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (used[i])
                continue;
            if (i > 0 && nums[i-1] == nums[i] && used[i-1])
                continue;

            used[i] = true;
            list.add(nums[i]);
            findNext(nums, used, list, ret);
            used[i] = false;
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args){
        int[] nums = {2,1,1};
        List<List<Integer>> ret = new No47().permuteUnique(nums);

        System.out.println(ret);
    }
}
