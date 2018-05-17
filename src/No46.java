import java.util.ArrayList;
import java.util.List;

public class No46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> solved = new ArrayList<>();
        searchNext(nums, 0, solved);

        return solved;
    }

    public void searchNext(int[] nums, int pos, List<List<Integer>> solved){
        if (pos == nums.length){
            List<Integer> tmp = new ArrayList<>();
            for (int n : nums)
                tmp.add(n);
            solved.add(tmp);
            return;
        }

        for (int i = pos; i < nums.length; i++){
            swap(nums, pos, i);
            searchNext(nums, pos+1, solved);
            swap(nums,pos,i);
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args){
        int[] nums = {2,2,1,1};

        List<List<Integer>> ret = new No46().permute(nums);
        System.out.println(ret);

    }

}
