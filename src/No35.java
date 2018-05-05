public class No35 {
    private int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0 || nums[0] > target || nums[0] == target)
            return 0;

        int i = 0;
        while (i < nums.length - 1){
            if (nums[i+1] < target){
                i++;
                continue;
            }
            return i+1;
        }
        return nums.length;
    }

    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int r = new No35().searchInsert(nums,0);
        System.out.print(r);
    }
}
