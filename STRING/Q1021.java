import java.util.Stack;

public class Q1021 {
    public static void main(String[] args) {

        System.out.println(removeOuterParentheses("(())()((()()))"));
    }
    static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
StringBuilder ans =new StringBuilder();
char ch;
        for (int i = 0; i < s.length(); i++) {
          ch = s.charAt(i);
          if (ch == '('){
              if (! stack.isEmpty()){
                  ans.append(ch);
              }
              stack.push(ch);
          }else {
              stack.pop();
              if (! stack.isEmpty()){
                  ans.append(ch);
              }
          }
        }
       return ans.toString();
    }
}
