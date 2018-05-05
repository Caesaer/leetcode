import java.util.Arrays;

public class No31 {
    private void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1)
            return;

        int pos = nums.length - 2;
        while (pos > 0){
            if (nums[pos+1] <= nums[pos])
                pos--;
            else
                break;
        }
        int minSub = Integer.MAX_VALUE;
        int swapper = 0;
        for (int i = pos+1; i < nums.length; i++) {
            if (nums[i] > nums[pos] && nums[i] - nums[pos] <= minSub) {
                minSub = Math.max(0, nums[i] - nums[pos]);
                swapper = i;
            }
        }
        swap(nums,swapper, pos);
        if (pos == swapper)
            reverse(nums, pos);
        else
            reverse(nums,pos+1);
    }

    private void reverse(int[] nums, int pos){
        int i = pos;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args){
        int[] nums = {2,3,1,3,3};
        new No31().nextPermutation(nums);
        for (int n : nums)
            System.out.print(n + " ");
    }
}
