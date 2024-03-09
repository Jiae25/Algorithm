import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 카드의 개수
        int[] P = new int[N + 1]; // 카드팩의 가격
        int[] dp = new int[N + 1]; // 카드 묶음을 구매하는 데 필요한 최소 가격 저장

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++){
            P[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= N; i++){ // 카드 묶음 개수
            dp[i] = P[i]; // 초기값은 i개의 카드를 1개씩 사는 경우
            for(int j = 1; j <= i; j++){
                dp[i] = Math.min(dp[i-j] + P[j], dp[i]); // i개 카드를 구매하는데 필요한 최소 가격
            }
        }

        System.out.println(dp[N]);
        br.close();
    }
}