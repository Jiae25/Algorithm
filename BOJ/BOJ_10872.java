import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10872 {
    private static int num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));
    }

    private static int factorial(int n) {
        if(n == 0){ // 계산을 끝내는 수
            return 1;
        }
        return n * factorial(n-1);
    }
}
