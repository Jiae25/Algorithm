import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int t = 0; t < n; t++){
            int x = Integer.parseInt(br.readLine());
            if (x != 0) {
                int[] dp = new int[x + 1];
                dp[0] = 1;
                dp[1] = 1;
                for (int i = 2; i <= x; i++){
                    dp[i] = dp[i - 1] + dp[i - 2];
                }
                System.out.println(dp[x]);
            }else{
                System.out.println(1);
            }
        }
    }
}