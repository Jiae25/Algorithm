import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++){
            int N = Integer.parseInt(br.readLine());
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int i = 0; i < N; i++){
                int num = Integer.parseInt(st.nextToken());
                min = min >= num ? num : min;
                max = max <= num ? num : max;
            }
            System.out.printf("%d %d\n", min, max);
        }
    }
}