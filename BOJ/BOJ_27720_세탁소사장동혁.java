import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_27720_세탁소사장동혁 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] coin = {25, 10, 5, 1};
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int cent = Integer.parseInt(br.readLine());
            for (int j = 0; j < 4; j++){
                sb.append(cent / coin[j]).append(" ");
                cent %= coin[j];
            }
            sb.append("\n");
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb.toString());
    }
}