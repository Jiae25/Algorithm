import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 수의 개수

        int MAX = 1000; // 자연수의 범위
        boolean[] isPrime  = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;  // 0과 1은 false. 소수이면 true

        // Sieve Of Eratosthenes
        for(int i = 2; i * i <= MAX; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= MAX; j+= i){ // i의 배수는 소수가 아님. i*i 미만의 배수는 이미 지워졌음
                   isPrime[j] = false;
                }
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int answer = 0;
        for (int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(isPrime[num]){ // 주어진 수에서 소수 카운팅
                answer++;
            }
       }
        System.out.println(answer);
    }
}