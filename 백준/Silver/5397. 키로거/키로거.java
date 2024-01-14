import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < TC; tc++){
            String input = br.readLine();
            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();
            for(char c : input.toCharArray()){
                if(c == '<'){
                    if(!left.isEmpty()){
                        right.push(left.pop());
                    }
                } else if (c == '>') {
                    if(!right.isEmpty()){
                        left.push(right.pop());
                    }
                }else if (c == '-') {
                    if(!left.isEmpty()){
                        left.pop();
                    }
                }else{
                    left.push(c);
                }
            }
            StringBuilder sb = new StringBuilder();
            for(Character c : left){
                sb.append(c);
            }
            while(!right.isEmpty()){
                sb.append(right.pop());
            }
            System.out.println(sb.toString());
        }

    }
}