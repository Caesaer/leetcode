
public class No38 {

//    public String countAndSay(int n) {
//        String s = "1";
//        StringBuffer sb = new StringBuffer();
//        for (int i = 1; i < n; i++){
//            char num = s.charAt(0);
//            int counter = 0;
//            for (int j = 0; j < s.length(); j++) {
//                if (s.charAt(j) == num)
//                    counter++;
//                else {
//                    sb.append(counter);
//                    sb.append(num);
//                    num = s.charAt(j);
//                    counter = 1;
//                }
//            }
//            sb.append(counter);
//            sb.append(num);
//            s = sb.toString();
//            sb.setLength(0);
//        }
//
//        return s;
//    }

    private String countAndSay(int n){
        String s = "1";
        for (int i = 1; i < n; i++){
            StringBuffer sb = new StringBuffer();
            int counter = 1;
            for (int j = 0; j < s.length(); j++){
                if (j == s.length() - 1 || s.charAt(j) != s.charAt(j+1)){
                    sb.append(s.charAt(j));
                    sb.append(counter);
                    counter = 1;
                }
                else
                    counter ++;
            }
            s = sb.toString();
        }

        return s;
    }

    public static void main(String[] args){

        int n = 4;
        String ret = new No38().countAndSay(n);
        System.out.println(ret);
    }
}
