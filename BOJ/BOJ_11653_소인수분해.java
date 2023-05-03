import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11653_소인수분해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int prime = 2;
        while (prime <= N) {
            if (N % prime == 0) {
                System.out.println(prime);
                N /= prime;
            } else {
                prime++;
            }
        }
    }
}