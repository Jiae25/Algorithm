import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long count = 0;
        if (n >= 3) {
            count = (long) n * (n - 1) * (n - 2) / 6;
        }
        System.out.println(count);
        System.out.println(3);
    }
}