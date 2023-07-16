import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5361_전투드로이드가격 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++){
            double[] parts = {350.34, 230.90, 190.55, 125.30, 180.90};
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            double sum = 0;
            for (int i = 0; i < parts.length; i++){
                parts[i] *= Integer.parseInt(st.nextToken());
                sum += parts[i];
            }
            System.out.printf("$%.2f\n", sum);
        }
    }
}
