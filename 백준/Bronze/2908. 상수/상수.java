import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = reverseNumber(str[0]);
        int b = reverseNumber(str[1]);
        System.out.println(Math.max(a, b));
        br.close();;
    }

    private static int reverseNumber(String s) {
        return Integer.parseInt(new StringBuilder(s).reverse().toString());
    }
}