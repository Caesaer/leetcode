import java.util.ArrayList;
import java.util.List;

public class No93 {

//    private List<String> restoreIpAddresses(String s) {
//        List<String> ips = new ArrayList<>();
//
//        dfshelper(s, 0, 0, "", ips);
//        return ips;
//    }
//
//    private void dfshelper(String s, int pos, int segnum, String restored, List<String> ips){
//        if (pos == s.length() && segnum == 4){
//            ips.add(restored);
//            return;
//        }
//
//        if (segnum > 4)
//            return;
//
//        for (int i = 1; i < 4; i++){
//            if (pos+i > s.length()) break;
//            String seg = s.substring(pos, pos+i);
//            if (seg.startsWith("0") && seg.length() > 1 || i == 3 && Integer.valueOf(seg) >= 256)
//                continue;
//            dfshelper(s,pos+i, segnum+1, restored+seg+(segnum==3? "":"."), ips);
//        }
//    }

    public List<String> restoreIpAddresses(String s){
        List<String> list = new ArrayList<>();

        for (int i = 1; i < 4 && i <= s.length()-3; i++)
            for (int j = i+1; j < i+4 && j <= s.length()-2; j++)
                for (int k = j+1; k < j+4 && k <= s.length()-1; k++){
                        String s1 = s.substring(0,i);
                        String s2 = s.substring(i,j);
                        String s3 = s.substring(j,k);
                        String s4 = s.substring(k);
                        if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4))
                            list.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                    return list;
    }

    private boolean isValid(String s){
        if (s.length()>3 || s.length()==0 || (s.charAt(0)=='0' && s.length()>1) || Integer.parseInt(s)>255)
            return false;
        return true;
    }

    public static void main(String[] args){
        String s = "010010";
        List<String> ips = new No93().restoreIpAddresses(s);
        System.out.println(ips);
    }
}
