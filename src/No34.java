public class No34 {
    private int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int i = 0;
        int j = nums.length - 1;
        while (i <= j){
            if (nums[i] == target && nums[j] == target)
                return new int[]{i,j};
            if (nums[i] < target)
                i++;
            if (nums[j] > target)
                j--;
        }
            return new int[]{-1,-1};
    }

    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 6;

        int[] ret = new No34().searchRange(nums,target);
        for (int c : ret)
            System.out.print(c + " ");
    }
}
