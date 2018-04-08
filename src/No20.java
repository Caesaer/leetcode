import java.util.Stack;

public class No20 {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);

            switch (c){
                case ')':
                    if (!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                    else
                        return false;
                case ']':
                    if (!stack.empty() && stack.peek() == '['){
                        stack.pop();
                        break;
                    }
                    else
                        return false;
                case '}':
                    if (!stack.empty() && stack.peek() == '{'){
                        stack.pop();
                        break;
                    }
                    else
                        return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args){
        String s = "";
        boolean islegal = new No20().isValid(s);
        System.out.println(islegal);
    }
}
