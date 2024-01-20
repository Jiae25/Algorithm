import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(combination(n, m));
    }

    private static BigInteger combination(int n, int m) {
        // n! / (m! * (n-m)!)
        BigInteger numerator = factorial(n);
        BigInteger denominator = factorial(m).multiply(factorial(n - m));

        return numerator.divide(denominator);
    }

    private static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for(int i = 2; i <= num; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}