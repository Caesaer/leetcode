
public class No53 {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int dp[] = new int[nums.length];
        int maxsum = 0;

        dp[0] = maxsum = nums[0];

        for (int i = 1; i < dp.length; i++)
            if (dp[i-1] + nums[i] > nums[i]) {
                dp[i] = dp[i - 1] + nums[i];
                if (dp[i] > maxsum)
                    maxsum = dp[i];
            }
            else {
                dp[i] = nums[i];
                if (dp[i] > maxsum)
                    maxsum = dp[i];
            }

            return maxsum;
    }


    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
