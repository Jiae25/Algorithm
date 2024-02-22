import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int n = Integer.parseInt(input);
            int result = findMultipleOfOne(n);
            System.out.println(result);
        }

        br.close();
    }

    private static int findMultipleOfOne(int n) {
        int num = 1;
        int count = 1;

        while (num % n != 0) {
            num = (num * 10 + 1) % n;
            count++;
        }

        return count;
    }
}