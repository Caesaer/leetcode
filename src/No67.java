public class No67 {

    public String addBinary(String a, String b){
        int al = a.length();
        int bl = b.length();
        int i, j;
        int carry = 0;
        StringBuffer sb = new StringBuffer();
        if (bl > al){
            String tmp = a;
            a = b;
            b = tmp;
            al = a.length();
            bl = b.length();
        }

        for (i = al-1, j = bl-1; i >=0 && j >=0; i--, j--){
            int n1 = a.charAt(i) - '0';
            int n2 = b.charAt(j) - '0';
            int sum = n1 + n2 + carry;

            if (sum > 1) {
                sb.append(sum % 2);
                carry = 1;
            }
            else {
                sb.append(sum);
                carry = 0;
            }
        }

        while (i >= 0){
            int n1 = a.charAt(i) - '0';
            int sum = n1 + carry;

            if (sum > 1){
                sb.append(sum % 2);
                carry = 1;
            }
            else {
                sb.append(sum);
                carry = 0;
            }
            i--;
        }

        if (carry > 0)
            sb.append(carry);

        return sb.reverse().toString();
    }

    public static void main(String[] args){
        String a = "1";
        String b = "111";

        System.out.println(new No67().addBinary(a, b));
    }
}
