import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2525_오븐시계 {
    private static int A, B, C;
    private static int min;
    private static int hour;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        A = Integer.parseInt(st.nextToken()); // 현재 시간
        B = Integer.parseInt(st.nextToken()); // 현재 분
        C = Integer.parseInt(br.readLine()); // 요리하는데 필요한 시간(분단위)

        min = B + C;
        hour = A + (min / 60);
        hour = (hour >= 24) ? hour % 24 : hour;
        min = min % 60;

        System.out.println(hour+" "+min);

    }

}