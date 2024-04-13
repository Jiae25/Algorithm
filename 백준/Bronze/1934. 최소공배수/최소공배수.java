import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()); // 첫 번째 수
            int B = Integer.parseInt(st.nextToken()); // 두 번째 수

            // 최대공약수
            int gcd = gcd(A, B);

            // 최소공배수 = 두 수의 곱 / 최대공약수
            int lcm = A * B / gcd;

            System.out.println(lcm);
        }

        br.close();
    }

    // 유클리드 호제법
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}