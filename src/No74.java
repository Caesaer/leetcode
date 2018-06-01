public class No74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        for (int i = 0; i < matrix.length; i++){
            if (bSearch(matrix[i], target))
                return true;
        }
        return false;
    }

    public boolean bSearch(int[] arr, int target){
        int lo = 0;
        int hi = arr.length - 1;
        if (arr == null || arr.length == 0 || arr[hi] < target) return false;

        while (lo <= hi){
            int mid = (lo + hi) / 2;
            if (arr[mid] < target)
                lo = mid + 1;
            else if (arr[mid] > target)
                hi = mid - 1;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        int[][] matrix = {{1}};

        System.out.println(new No74().searchMatrix(matrix, 1));
    }
}
