import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken()); // 사탕 종류의 수
            int K = Integer.parseInt(st.nextToken()); // 먹을때 행복한 최소값
            st = new StringTokenizer(br.readLine()," ");
            int answer = 0;
            for (int i = 0; i < N; i++){
                 int cnt = Integer.parseInt(st.nextToken());
                if(cnt >= K){
                    answer += cnt / K;
                }
            }
            System.out.println(answer);
        }
    }
}