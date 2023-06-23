import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10992_별찍기17 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < N; i++){
            for(int j = 0; j < N - i; j++){
                sb.append(" ");
            }
            sb.append("*");
            for (int k = 0; k < i * 2 - 3; k++){
                sb.append(" ");
            }
            if(i != 1) sb.append("*"); // 뒤에 붙어 나오는 *
            sb.append("\n");
        }
        for(int i = 0; i < N * 2 - 1; i++){
            sb.append("*");
        }
        System.out.println(sb.toString());
    }
}