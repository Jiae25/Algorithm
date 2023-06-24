import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2010_플러그 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 1;
        for (int i = 0; i < N; i++){
            int cnt = Integer.parseInt(br.readLine());
            sum = sum - 1 + cnt;
        }
        System.out.println(sum);
    }
}