import java.util.Arrays;

public class No16 {
    public int threeSumClosest(int[] nums, int target) {
        int ret = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length -2; i++){
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if (sum > target)
                    end --;
                else
                    start ++;

                if (Math.abs(sum-target) < Math.abs(ret-target))
                    ret = sum;
            }
        }

        return ret;
    }


    public static void main(String[] args){
        int[] nums = {-1,2,1,-4};
        System.out.println(new No16().threeSumClosest(nums,1));
    }

    //-1 2 1 -4 1 2 -2 3 -4 -1   t = 1
}
