import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
이항계수1
 */
public class BOJ_11050_이항계수1 {
    private static int N, K;
    private static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        // (1 ≤ N ≤ 10, 0 ≤ K ≤ N)
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        ans = 1;
        for (int i = 1; i <= K; i++){
            ans *= (N - i + 1);
            ans /= i;
        }
        System.out.println(ans);
    }
}
