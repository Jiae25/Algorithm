import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(int i = 0;i < N;i++) {
            int value = Integer.parseInt(br.readLine());
            switch(value) {
                case 0:
                    if(pq.size() == 0)
                        System.out.println(0);
                    else {
                        value = pq.poll();
                        System.out.println(value);
                    }
                    break;
                default:
                    pq.offer(value);
                    break;
            }
        }
    }
}