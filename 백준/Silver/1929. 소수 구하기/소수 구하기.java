import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // M이상 N이하의 소수 찾기
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        // 에라토스테네스의 채
        for(int i = 2; i * i <= N; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= N; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        
        // 소수 출력
        StringBuilder answer = new StringBuilder();
        for(int i = M; i <= N; i++){
            if(isPrime[i]){
                answer.append(i + "\n");
            }
        }
        System.out.println(answer.toString());

    }
}