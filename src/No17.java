import java.util.ArrayList;
import java.util.List;

public class No17 {

    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        if (digits == null || digits.length() == 0)
            return ret;

        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        returnResult(ret,sb,digits,map,0);
        return ret;
    }

    private void returnResult(List<String> ret,StringBuffer sb, String digits, String[] map, int pos){
        if (pos == digits.length()) {
            ret.add(sb.toString());
            return;
        }

        int index = digits.charAt(pos) - '0';
        String words = map[index];
        for (int i = 0; i < words.length(); i++){
            sb.append(words.charAt(i));
            returnResult(ret,sb,digits,map,pos+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args){
        String digits = "232";
        List<String> ret = new No17().letterCombinations(digits);
        System.out.println(ret);
    }


}
