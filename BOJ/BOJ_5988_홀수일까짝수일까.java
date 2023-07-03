import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5988_홀수일까짝수일까 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++){
            String num = br.readLine();
            int lastDigit = Character.getNumericValue(num.charAt(num.length() - 1));
            String answer = lastDigit % 2 == 0 ? "even" : "odd";
            System.out.println(answer);
        }
    }
}
