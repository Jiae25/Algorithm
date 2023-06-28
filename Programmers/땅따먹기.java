import java.io.IOException;

public class 땅따먹기 {
    public static void main(String[] args) throws IOException {
        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        System.out.println(solution(land));
    }

    private static int solution(int[][] land) {
        int answer = 0;
        int[][] dp = new int[land.length][4];
        for (int i = 0; i < 4; i++){
            dp[0][i] = land[0][i];
        }
        for (int i = 1; i < land.length; i++){
            dp[i][0] = Math.max(dp[i-1][1], Math.max(dp[i-1][2], dp[i-1][3])) + land[i][0];
            dp[i][1] = Math.max(dp[i-1][0], Math.max(dp[i-1][2], dp[i-1][3])) + land[i][1];
            dp[i][2] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][3])) + land[i][2];
            dp[i][3] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2])) + land[i][3];
        }
        for (int i = 0; i < 4; i++){
            answer = Math.max(dp[land.length - 1][i], answer);
        }

        return answer;
    }
}