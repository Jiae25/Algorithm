import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
다리놓기 DP(Dynamic Programming)
dp[i][j] : 서쪽 i개의 사이트와 동쪽 j개의 사이트가 있을 때, 다리를 지을 수 있는 경우의 수
dp[i][j] = dp[i-1][j-1] + dp[i-1][j] (i > j)
dp[i][j] = 1 (i == j)
dp[i][j] = 0 (i < j)
 */
public class BOJ_1010_다리놓기 {
    private static int N, M;
    private static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력
        for (int tc = 0; tc < T; tc++){ // 테스트 케이스 반복
            String[] input = br.readLine().split(" ");
            // N <= M
            N = Integer.parseInt(input[0]); // 서쪽 사이트의 개수
            M = Integer.parseInt(input[1]); // 동쪽 사이트의 개수

            int[][] dp = new int[N+1][M+1];

            for (int i = 0; i <= M; i++){
                dp[tc][i] = i;
            }

        }
    }
}
