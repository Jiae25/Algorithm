import java.util.Stack;

/*
올바른 괄호
 */
public class 올바른괄호 {
    static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }else if(stack.isEmpty()){
                answer = false;
                break;
            }else {
                stack.pop();
            }
        }
        if(!stack.isEmpty()) {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = ")()(";
        System.out.println(solution(s));
    }
}