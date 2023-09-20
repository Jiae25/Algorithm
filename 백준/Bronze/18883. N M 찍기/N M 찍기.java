import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int num = 1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                sb.append(num++);
                if(j != m - 1) sb.append(" ");
            }
            sb.append("\n");
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb.toString());
    }
}