import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13136_DoNotTouchAnything {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long R = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());
        long N = Integer.parseInt(st.nextToken());

        long row = (R % N == 0) ? R / N : R / N + 1;
        long col = (C % N == 0) ? C / N : C / N + 1;

        long result = row * col;
        System.out.println(result);
    }
}
