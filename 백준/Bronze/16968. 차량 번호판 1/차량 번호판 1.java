import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] carNum = br.readLine().toCharArray();
        int answer = 1;

        for (int i = 0; i < carNum.length; i++) {
            // 첫 번째 숫자의 경우의 수
            if (i == 0) {
                answer *= (carNum[i] == 'c') ? 26 : 10;
            } else {
                // 두 번째 숫자부터의 경우의 수
                if (carNum[i] == carNum[i - 1]) {
                    answer *= (carNum[i] == 'c') ? 25 : 9;
                } else {
                    answer *= (carNum[i] == 'c') ? 26 : 10;
                }
            }
        }

        System.out.println(answer);
    }
}
