import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 연산의 개수
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){ // 가장 작은 값 출력 후 값 제거
                if(minHeap.isEmpty()){
                    sb.append("0\n");
                }else{
                    sb.append(minHeap.poll()).append("\n");
                }
            }else { // x 추가
                minHeap.add(x);
            }
        }
        System.out.println(sb.toString());
    }
}