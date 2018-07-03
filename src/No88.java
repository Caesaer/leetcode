public class No88 {

    private void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0){
            if (nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }

        while (j >= 0)
            nums1[k--] = nums2[j--];
    }

    public static void main(String[] args){
        int[] nums1 = {2,0};
        int[] nums2 = {1};

        new No88().merge(nums1, 1, nums2, 1);

        for (int n : nums1){
            System.out.print(n + " ");
        }

    }
}
 /*
 *  1 2 3 2 5 6
 *
 * */