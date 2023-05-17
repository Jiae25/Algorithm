import java.io.IOException;
import java.util.Stack;

public class 괄호회전하기 {

    public static void main(String[] args) throws IOException {
        String s = "[](){}";
        System.out.println(solution(s));
    }

    //(), [], {}
    private static int solution(String s) {
        int answer = 0; // 올바른 괄호를 만들 수 있는 개수
        for (int i = 0; i < s.length(); i++){ // 문자열 바꾸면서 괄호 확인
            if(check(s)){ // 올바른 괄호 상태인지 확인하는 메서드
                answer++; // 올바른 괄호 상태이면 answer++;
            }
            s = s.substring(1) + s.charAt(0); // 회전 시켜서 문자열 바꾸기
        }
        return answer;
    }

    private static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){ // 현재 문자열의 괄호 상태
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){ // 만약 시작하는 괄호이면 스택에 push
                stack.push(c);
            }else{ // 시작하는 괄호가 아닌 경우
                if(stack.isEmpty()){ // 스택이 비어있는 상태이면 false하고 다음 s(=회전) 확인
                    return false;
                }
                char top = stack.peek();
                if((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}

