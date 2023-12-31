import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트케이스 개수
        for (int t = 0; t < T; t++){
            int N = Integer.parseInt(br.readLine()); // 수첩1에 적힌 정수의 개수
            HashSet<Integer> set = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int i = 0; i < N; i++){ // set에 정수 저장
                set.add(Integer.parseInt(st.nextToken()));
            }
            int M = Integer.parseInt(br.readLine()); // 수첩2에 적힌 정수의 개수
            st = new StringTokenizer(br.readLine(), " ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++){
                int num = Integer.parseInt(st.nextToken());
                sb.append(set.contains(num) ? "1\n" : "0\n"); // set에 num이 있는지 확인. 있으면 1 없으면 0
            }
            System.out.println(sb.delete(sb.length() - 1, sb.length()));
        }
    }
}