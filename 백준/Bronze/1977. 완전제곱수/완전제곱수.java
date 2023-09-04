import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int minSquare = (int) Math.ceil(Math.sqrt(M)); // 범위 내에서의 최소 완전 제곱수
        int maxSquare = (int) Math.floor(Math.sqrt(N)); // 범위 내에서의 최대 완전 제곱수

        int sum = 0; // 완전 제곱수들의 합
        int minSquareValue = Integer.MAX_VALUE; // 최솟값 초기화

        for (int i = minSquare; i <= maxSquare; i++) {
            int square = i * i;
            sum += square;
            if (square < minSquareValue) {
                minSquareValue = square;
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minSquareValue);
        }

        br.close();
    }
}