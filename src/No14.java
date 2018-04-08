public class No14 {

    public String longestCommonPrefix(String[] strs) {
        int count = 0;
        boolean issame = true;

        if (strs == null || strs.length == 0)
            return "";

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++)
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[j - 1].charAt(i) || strs[j].equals("")) {
                    issame = false;
                    break;
                }

            if (issame)
                count ++;
            else
                break;
        }

        if (count != 0)
            return strs[0].substring(0,count);
        else
            return "";
    }


    public static void main(String[] args) {
        String[] strs = {"abcd", "ab", "a"};
        String res = new No14().longestCommonPrefix(strs);

        System.out.println(res);
    }
}
