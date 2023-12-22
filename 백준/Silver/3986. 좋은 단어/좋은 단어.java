import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 단어의 수

        Stack<Character> stack = new Stack<>();
        int goodWord = 0;
        for (int i = 0; i < N; i++){
            String input = br.readLine();
            if(input.length() % 2 != 0) { // 단어가 홀수일 경우 좋은단어가 아님
                continue;
            }
            for (int j = 0; j < input.length(); j++){
                char c = input.charAt(j);
                if(!stack.isEmpty() && stack.peek() == c){
                    stack.pop();
                }else {
                    stack.push(c);
                }

            }
            if(stack.isEmpty()){
                goodWord++;
            }
            stack.clear();
        }
        System.out.println(goodWord);

    }
}