import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int max = 0;
        for (int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num > max){
                for (int j = max + 1; j <= num; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                max = num;
            }else if(stack.peek() != num){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}