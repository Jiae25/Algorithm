import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken()); // 일의 개수
        int T = Integer.parseInt(st.nextToken()); // 분
        st = new StringTokenizer(br.readLine()," ");
        int answer = 0;
        for (int i = 0; i < n; i++){
            T -= Integer.parseInt(st.nextToken());
            if(T < 0){
                answer = i;
                break;
            }
            answer = i + 1;
        }

        System.out.println(answer);
    }
}