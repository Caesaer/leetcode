public class No27 {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int swap;
        while (i <= j){
            if (nums[j] == val) {
                j--;
                continue;
            }
            if (nums[i] == val){
                swap = nums[i];
                nums[i] = nums[j];
                nums[j] = swap;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args){
        int[] nums = {1};
        int val = 1;
        int index = new No27().removeElement(nums,val);
        System.out.println(index);
        for (int i = 0; i < index; i ++)
            System.out.print(nums[i] + " ");
    }
}
