import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder sb = new StringBuilder();
        while(!(input = br.readLine()).equals(".")){ // 입력이 .인 경우 종료
            sb.append(checkBalance(input)).append("\n"); // 괄호 검사 결과
        }
        System.out.println(sb.delete(sb.length() - 1, sb.length()));
    }

    private static String checkBalance(String input) { // 괄호 문자열의 균형을 확인하는 함수
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()){
            if(ch == '('  || ch == '['){
                stack.push(ch);
            }else if(ch == ')' || ch == ']'){
                if(stack.isEmpty() || !isPair(stack.pop(), ch)){ // 스택이 비어있거나 짝이 안맞으면 no 리턴
                    return "no";
                }
            }
        }
        return stack.isEmpty() ? "yes" : "no"; // 모든 괄호 짝이 맞고, 스택이 비어있는 경우 yes 리턴
    }

    private static boolean isPair(Character open, char close) { // 괄호의 짝 확인하는 함수
        return (open == '(' && close == ')') || (open == '[' && close == ']'); 
    }
}