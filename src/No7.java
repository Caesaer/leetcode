
public class No7 {
    public int reverse(int x) {
        int res = 0;
        int newres;
        int digit;
        while (x != 0){
            digit = x % 10;
            newres = res * 10 + digit;
            x /= 10;
            if ((newres - digit) / 10 != res )
                return 0;
            res = newres;
        }
        return res;
    }


    public static void main(String[] args){
        int x = 123;
        System.out.println(new No7().reverse(x));
    }
}
