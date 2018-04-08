import java.util.*;

public class No18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int sum;
        HashSet<List<Integer>> ret = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++){
            for (int j = i + 1; j < nums.length - 2; j++){
                int p = j + 1;
                int q = nums.length - 1;
                while (p < q){
                    sum = nums[i] + nums[j] + nums[p] + nums[q];
                    if (sum == target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[p]);
                        list.add(nums[q]);
                        Collections.sort(list);
                        ret.add(list);
                        p++;
                    }
                    else if (sum > target)
                        q--;
                    else
                        p++;
                }
            }
        }
        return new ArrayList<>(ret);
    }

    public static void main(String[] args){
        int[] nums = {1,0,-1,0,-2,2};
        List<List<Integer>> ret = new No18().fourSum(nums,0);
        System.out.println(ret);
    }
}
