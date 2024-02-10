import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 자연수 N

        long sum = 0; // 1 <= N <= 1000,000
        for(int i = 1; i <= N; i++){ // N이하 자연수의 약수들의 합을 더함
            sum += i * (N / i);
        }
        System.out.println(sum);
    }
}
