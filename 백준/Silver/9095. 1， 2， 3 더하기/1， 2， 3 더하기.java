import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트케이스

        for(int t = 0; t < T; t++){
            int n = Integer.parseInt(br.readLine()); // 1, 2, 3의 합으로 구할 수 있는 수
            int[] dp = new int[n + 1];

            dp[0] = 1;
            if(n >= 1) dp[1] = 1; // n의 범위 고려
            if(n >= 2) dp[2] = 2;
            for(int i = 3; i <= n; i++){
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3]; // 점화식
            }

            System.out.println(dp[n]);
        }
    }
}