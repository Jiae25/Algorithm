import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2783_삼각김밥 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int sevenX = Integer.parseInt(st.nextToken());
        int sevenY = Integer.parseInt(st.nextToken()); // y그램 당 x원
        int T = Integer.parseInt(br.readLine());
        double min = Integer.MAX_VALUE;
        for (int t = 0; t < T; t++){
            st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            min = Math.min(x * (1000.0 / y), min);
        }
        min = Math.min(sevenX * (1000.0 / sevenY), min);
        System.out.printf("%.2f\n", min);
    }
}
