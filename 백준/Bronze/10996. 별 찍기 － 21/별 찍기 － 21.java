import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N * 2; i++){
            for (int j = 0; j < N; j++){
                if((i + j) % 2 == 0) sb.append("*");
                else sb.append(" ");
            }
            sb.append("\n");
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb.toString());
        br.close();
    }
}