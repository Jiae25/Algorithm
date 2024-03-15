import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 명령의 수

        Deque<Integer> deque = new ArrayDeque<>();
        int num = 0;
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            String command = input[0];

            if(command.contains("push")){
                num = Integer.parseInt(input[1]);
            }

            switch (command){
                case "push_front" :
                    deque.addFirst(num);
                    break;
                case "push_back" :
                    deque.addLast(num);
                    break;
                case "pop_front" :
                    if(deque.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(deque.pollFirst()).append("\n");
                    }
                    break;
                case "pop_back" :
                    if(deque.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(deque.pollLast()).append("\n");
                    }
                    break;
                case "size" :
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    if(deque.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(deque.peekFirst()).append("\n");
                    }
                    break;
                case "back" :
                    if(deque.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(deque.peekLast()).append("\n");
                    }
                    break;
            }
        }
        // 결과 출력
        System.out.println(sb.toString());
        
        br.close();
    }
}
