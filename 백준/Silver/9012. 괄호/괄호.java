import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        for (int t = 0; t < T; t++){
            stack.clear();
            String input = br.readLine();
            if(input.length() % 2 != 0 || input.charAt(0) == ')') {
                System.out.println("NO");
                continue;
            }
            for (int i = 0; i < input.length(); i++){
                if(stack.isEmpty() || input.charAt(i) == '(') {
                    stack.push(input.charAt(i));
                }else if(stack.peek() == '(' && input.charAt(i) == ')'){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}