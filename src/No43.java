
public class No43 {
    private String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();

        int[] pos = new int[m + n];

        for (int i = m-1; i >= 0; i--)
            for (int j = n-1; j >= 0; j--){
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i +j + 1;
                int sum = pos[p2] + mul;

                pos[p1] += sum / 10;
                pos[p2] = sum % 10;
            }

        StringBuffer sb = new StringBuffer();
        for (int p : pos)
            if (!(sb.length() == 0 && p == 0))
                sb.append(p);

        return sb.length() == 0? "0": sb.toString();
    }

    public static void main(String[] args){
        String num1 = "123";
        String num2 = "3";

        System.out.println(new No43().multiply(num1, num2));
    }
}
