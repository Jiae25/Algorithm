import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<String> queue = new ArrayDeque<>();
        String last = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            switch (input[0]){
                case "push" :
                    queue.add(input[1]);
                    last = input[1];
                    break;
                case "pop" :
                    sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(queue.size() + "\n");
                    break;
                case "empty" :
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                    break;
                case "back" :
                    sb.append(queue.isEmpty() ? -1 : last).append("\n");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}