public class No300 {

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int maxret = 0;
        dp[0] = 1;

        for (int i = 1; i < nums.length; i++){
            int maxval = 1;
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j])
                    maxval = Math.max(dp[j]+1, maxval);
            }
            dp[i] = maxval;
            if (maxval > maxret)
                maxret = maxval;
        }

        return maxret;
    }

    public static void main(String[] args){
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(new No300().lengthOfLIS(nums));
    }
}
