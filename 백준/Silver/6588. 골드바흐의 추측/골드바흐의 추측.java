import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static boolean[] isPrime;
    private static int MAX = 1000000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 에라토스테네스의 체를 사용하여 소수 판별
        initializePrime();

        while(true){
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                break;
            }

            sb.append(findGoldbach(n) + "\n");
        }
        System.out.println(sb.toString());
    }

    private static void initializePrime() {
        isPrime = new boolean[MAX + 1]; // 소수 판별 배열
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i * i <= MAX; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= MAX; j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }

    private static String findGoldbach(int n) {
        for(int i = 3; i <= n / 2; i+=2){ // n/2를 넘어가면 두 수 의 크기가 바뀌게 됨. i+=2는 홀수만 찾으면 되기 때문이다.
            if(isPrime[i] && isPrime[n - i]){ // i + (n - i) 가 n이기 때문에 다른 수는 비교할 필요가 없다.
                return n + " = " + i + " + " + (n - i);

            }
        }
        return "Goldbach's conjecture is wrong.";
    }
}