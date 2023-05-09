import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
코딩은 체육과목입니다
long int는 4바이트
long long int는 8바이트
 */
public class BOJ_25314_코딩은체육과목입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N/4; i++){
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}