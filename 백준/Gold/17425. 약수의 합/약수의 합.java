import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        int MAX = 1000001;
        long[] arr = new long[MAX];
        for(int i = 1; i < MAX; i++){
            for(int j = i; j < MAX; j+=i){
                arr[j] += i; // 약수들의 합
            }
            arr[i] += arr[i-1]; // g(n) = g(n-1) + f(n)
        }

        StringBuilder result = new StringBuilder();
        for(int t = 0; t < T; t++){
            int N = Integer.parseInt(br.readLine());
            result.append(arr[N] + "\n");
        }

        System.out.println(result.toString()); // 결과 출력
    }
}