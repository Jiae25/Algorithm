import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // Bottom-Up DP
        long[][] dp = new long[N + 1][2];

        // 초기값 설정
        dp[1][1] = 1; // 길이가 1인 이친수는 1 하나
        if(N > 1){
            dp[2][0] = 1; // 길이가 2인 이친수는 10 하나
        }
        
        // 길이가 3 이상인 경우 계산
        for (int i = 3; i <= N; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
            dp[i][1] = dp[i - 2][0] + dp[i - 2][1];
        }

        // N 길이의 이친수 개수 출력
        long result = dp[N][0] + dp[N][1];
        System.out.println(result);

        br.close();
    }
}