import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            if (isValid(str)) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        br.close();

        System.out.println(sb);
    }

    // 주어진 문자열이 올바른 괄호 문자열인지 판별하는 함수
    private static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false; // ')'가 나왔는데 스택이 비어있으면 올바른 괄호 문자열이 아님
                }
                stack.pop(); // '('와 ')'가 맞아 떨어짐
            }
        }
        return stack.isEmpty(); // 스택이 비어있으면 올바른 괄호 문자열
    }
}