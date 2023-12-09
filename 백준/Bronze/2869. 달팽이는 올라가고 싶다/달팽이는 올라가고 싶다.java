import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());  // 낮에 올라가는 미터
        int B = Integer.parseInt(st.nextToken());  // 밤에 미끄러지는 미터
        int V = Integer.parseInt(st.nextToken());  // 나무 막대의 높이

        // 올라가는 거리가 정상에 도달했을 때의 날짜를 계산
        int days = (int) Math.ceil((double) (V - A) / (A - B)) + 1;

        System.out.println(days);
    }
}