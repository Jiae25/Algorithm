import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        //Bottom-Up
        dp[1] = 1;
        if(N > 1){
            dp[2] = 3;
        }
        // 우측부터 채운다고 생각한다.
        // dp[i-1]까지 채워져 있을 경우 2x1 타일 1가지 방법으로 채울 수 있고
        // dp[i-2]까지 채워져 있을 경우 2x2 타일 1개로 채우는 방법과 1x2타일 2개로 채우는 방법 2가지가 존재한다. (2x1 타일은 dp[i-1]에서 고려함)
        for(int i = 3; i <= N; i++){
            dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
        }

        System.out.println(dp[N]);
    }
}