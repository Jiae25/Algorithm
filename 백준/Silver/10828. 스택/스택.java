import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 명령의 수
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++){
            String[] command = br.readLine().split(" ");
            switch (command[0]){
                case "push" :
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case "pop" :
                    if(stack.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.pop());
                    }
                    break;
                case "size" :
                    System.out.println(stack.size());
                    break;
                case "empty" :
                    if(stack.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "top" :
                    if(stack.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.peek());
                    }
                    break;
            }
        }
    }
}