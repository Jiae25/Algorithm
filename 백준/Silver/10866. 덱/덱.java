import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            switch (input[0]){
                case "push_front" :
                    deque.addFirst(input[1]);
                    break;
                case "push_back" :
                    deque.addLast(input[1]);
                    break;
                case "pop_front" :
                    System.out.println(deque.isEmpty() ? -1 : deque.pollFirst());
                    break;
                case "pop_back" :
                    System.out.println(deque.isEmpty() ? -1 : deque.pollLast());
                    break;
                case "size" :
                    System.out.println(deque.size());
                    break;
                case "empty" :
                    System.out.println(deque.isEmpty() ? 1 : 0);
                    break;
                case "front" :
                    System.out.println(deque.isEmpty() ? -1 : deque.peekFirst());
                    break;
                case "back" :
                    System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
                    break;
            }
        }
    }
}