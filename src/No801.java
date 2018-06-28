public class No801 {

    public int minSwap(int[] A, int[] B) {
        int swap = 1, no_swap = 0;
        int temp;
        for (int i = 1; i < A.length; i++) {
            if (A[i-1] >= B[i] || B[i-1] >= A[i])
                swap++;
            else if (A[i-1] >= A[i] || B[i-1] >= B[i]) {
                temp = swap;
                swap = no_swap + 1;
                no_swap = temp;
            }
            else {
                int min = Math.min(swap, no_swap);
                swap = min + 1;
                no_swap = min;
            }
        }
        return Math.min(swap, no_swap);
    }

    public static void main(String[] args){
        int[] A = {1,3,5,4,9};
        int[] B = {1,2,3,7,10};

        System.out.println(new No801().minSwap(A, B));
    }
}
