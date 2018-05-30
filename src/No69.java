public class No69 {

    public int mySqrt(int x) {
        int min = 1;
        int max = x;
        if (x == 0) return 0;
        while (true){
            int mid = (min + max) / 2;
            if (mid > x / mid)    //mid * mid overflows
                max = mid - 1;
            else {
                if (mid+1 > x / (mid+1))
                    return mid;
                min = mid + 1;
            }
        }
    }

    public static void main(String[] args){
        System.out.println(new No69().mySqrt(8));
    }
}
