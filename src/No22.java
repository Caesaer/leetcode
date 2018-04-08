import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No22 {
    public List<String> generateParenthesis(int n) {
        int l = 0;
        int r = 0;
        List<String> ret = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        generating(l,r,ret,sb,n);
        return ret;
    }

    private void generating(int l, int r, List<String> ret, StringBuffer sb,int n) {
        if (sb.length() == 2*n){
            ret.add(sb.toString());
            return;
        }

        if (l < n){
            sb.append('(');
            generating(l+1,r,ret,sb,n);
            sb.setLength(sb.length() - 1);
        }
        if (r < l){
            sb.append(')');
            generating(l,r+1,ret,sb,n);
            sb.setLength(sb.length() - 1);
        }
    }

    public static void main(String[] args){
        int n = 3;
        List<String> ret = new No22().generateParenthesis(n);
        System.out.println(ret);
    }
}
