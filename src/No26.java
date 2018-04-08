public class No26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int temp = nums[0];
        int i,j;
        i = 1;
        j = 1;

        while (j < nums.length){
            if (temp != nums[j]) {
                temp = nums[j];
                nums[i++] = temp;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args){
        int[] nums = {1,1,3,4,22,22,22};
        int index = new No26().removeDuplicates(nums);
        System.out.println(index);
        for (int i = 0; i < index; i ++)
            System.out.print(nums[i] + " ");
    }

    /*
    1 1 2 2 2 3 3 4 5 6
     */
}
