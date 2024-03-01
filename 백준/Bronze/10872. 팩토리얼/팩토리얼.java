import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = factorial(N);
        System.out.println(result);

        br.close();
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
}