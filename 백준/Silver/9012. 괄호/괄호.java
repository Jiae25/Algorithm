import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // TC
        for(int t = 0; t < T; t++){
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();

            if(input.length() % 2 != 0 || input.charAt(0) == ')'){ // 짝이 맞지 않는 괄호 || )로 시작되는 괄호
                System.out.println("NO");
                continue;
            }

            for(int i = 0; i < input.length(); i++){
                char c = input.charAt(i);
                if(stack.isEmpty() || c == '('){
                    stack.push(c);
                }else if(stack.peek() == '(' && c == ')'){ // vps 일경우 (괄호를 pop
                    stack.pop();
                }
            }

            if(stack.isEmpty()){ // vps
                System.out.println("YES");
            }else{ // !vps
                System.out.println("NO");
            }
        }
    }
}
