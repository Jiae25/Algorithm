import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                sb.append(reverse(word)).append(" "); // 단어를 거꾸로 하여 StringBuilder에 추가
            }

            System.out.println(sb.toString().trim()); // 공백 제거 후 출력
        }
    }

    // 단어를 거꾸로 하는 함수
    private static String reverse(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}
