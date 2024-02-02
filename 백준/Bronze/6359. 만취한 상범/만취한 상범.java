import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // 방의 개수
            boolean[] rooms = new boolean[n + 1]; // 방의 상태를 저장하는 배열

            // 문을 열거나 닫는 동작을 반복
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j += i) {
                    rooms[j] = !rooms[j]; // 방의 상태를 변경
                }
            }

            // 열려 있는 방의 개수를 세기
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (rooms[i]) {
                    count++;
                }
            }

            System.out.println(count);
        }

        br.close();
    }
}