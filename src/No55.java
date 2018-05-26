public class No55 {

    private boolean canJump(int[] nums) {
        boolean[] jump = new boolean[nums.length];
        int hi = nums.length-1;
        int lo;
        jump[nums.length-1] = true;
        for (int i = 0; i < jump.length-1; i++)
            if (nums[i] == 0)
                jump[i] = false;

        for (lo = hi-1; lo >= 0; lo--)
            for (int i = 1; i <= nums[lo];i++)
                if (lo + i == nums.length-1 || jump[lo+i]) {
                    jump[lo] = true;
                    break;
                }
        return jump[0];

    }
    public static void main(String[] args){
        int[] nums = {3,2,1,0,4};

        System.out.println(new No55().canJump(nums));

    }
}
