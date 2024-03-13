import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // Bottom-Up DP
        int[] dp = new int[N];
        dp[0] = 1; // 길이가 1인 수열의 길이는 항상 1

        for (int i = 1; i < N; i++) {
            dp[i] = 1; // 자기 자신을 포함하는 가장 긴 증가하는 부분 수열 길이는 최소 1

            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        // 가장 긴 증가하는 부분 수열의 길이 출력
        int result = 0;
        for (int i = 0; i < N; i++) {
            result = Math.max(result, dp[i]);
        }

        System.out.println(result);

        br.close();
    }
}