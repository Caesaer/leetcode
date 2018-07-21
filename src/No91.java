public class No91 {

    public int numDecodings(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = (s.charAt(0) == '0')? 0: 1;

        for (int i = 2; i <= s.length(); i++){
            int onedig = Integer.valueOf(s.substring(i-1,i));
            int twodigs = Integer.valueOf(s.substring(i-2,i));

            if (onedig > 0 && onedig < 10)
                dp[i] += dp[i-1];
            if (twodigs >= 10 && twodigs <= 26)
                dp[i] += dp[i-2];

        }
        return dp[s.length()];
    }

    public static void main(String[] args){
        String s = "1011071";

        System.out.println(new No91().numDecodings(s));
    }

}

/*
*  2  2  0  6
*
*
*
* */