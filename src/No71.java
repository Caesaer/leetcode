import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class No71 {

    public String simplifyPath(String path) {
        HashSet<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
        Deque<String> stack = new LinkedList<>();

        for (String dir : path.split("/")){
            if (!stack.isEmpty() && dir.equals(".."))
                stack.pop();
            else if (!skip.contains(dir))
                stack.push(dir);
        }

        String s = "";
        for (String dir : stack)
            s = "/" + dir + s;

        return (stack.isEmpty())? "/" : s;
    }

    public static void main(String[] args){
        String path = "/abc/...";
        System.out.println(new No71().simplifyPath(path));
    }
}
