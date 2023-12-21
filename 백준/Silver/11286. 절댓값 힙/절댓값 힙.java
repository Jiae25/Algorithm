import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minAbsHeap = new PriorityQueue<Integer>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);

            if(absA == absB){
                return Integer.compare(a, b);
            }

            return Integer.compare(absA, absB);
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(minAbsHeap.isEmpty()){
                    sb.append("0\n");
                }else{
                    sb.append(minAbsHeap.poll()).append("\n");
                }
            }else{
                minAbsHeap.add(x);
            }
        }
        System.out.println(sb.toString());
    }
}