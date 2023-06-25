import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2476_주사위게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int price = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            if(A == B && B == C){
                price = 10000 + A * 1000;
            } else if (A == B || A == C) {
                price = 1000 + A * 100;
            } else if (B == C) {
                price = 1000 + B * 100;
            }else{
                price = Math.max(A, Math.max(B, C)) * 100;
            }
            max = Math.max(price, max);
        }
        System.out.println(max);
    }
}