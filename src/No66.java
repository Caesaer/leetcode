

public class No66 {

    public int[] plusOne(int[] digits){
        int i = digits.length - 1;
        while (i >= 0){
            digits[i] += 1;
            if (digits[i] >= 10){
                digits[i] %= 10;
                i--;
            }
            else
                break;
        }

        if (i < 0) {
            int[] ret = new int[digits.length+1];
            ret[0] = 1;
            for (int k = 0, j = 1; k < digits.length; k++)
                ret[j++] = digits[k];
            return ret;
        }
        return digits;
    }

    public static void main(String[] args){
        int[] digits = {9,8,9};
        digits = new No66().plusOne(digits);
        for (int n : digits)
            System.out.print(n + " ");
    }
}
