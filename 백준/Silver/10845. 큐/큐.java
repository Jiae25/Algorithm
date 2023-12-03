import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<String> queue = new LinkedList<>();
        String last = "";
        for (int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            switch (input[0]){
                case "push" :
                    queue.add(input[1]);
                    last = input[1];
                    break;
                case "pop" :
                    System.out.println(queue.isEmpty() ? -1 : queue.poll());
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" :
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                case "front" :
                    System.out.println(queue.isEmpty() ? -1 : queue.peek());
                    break;
                case "back" :
                    System.out.println(queue.isEmpty() ? -1 : last);
                    break;
            }
        }
    }
}