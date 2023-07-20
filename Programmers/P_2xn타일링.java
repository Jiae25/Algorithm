import java.io.IOException;

public class P_2xn타일링 {
    public static void main(String[] args) throws IOException {
        int n = 5;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        if(n <= 2){
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++){
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        answer = dp[n];
        return answer;
    }
}