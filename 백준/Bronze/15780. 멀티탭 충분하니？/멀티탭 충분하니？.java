import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken()); // 학생의 수
        int K = Integer.parseInt(st.nextToken()); // 멀티탭의 수
        st = new StringTokenizer(br.readLine(), " ");
        String answer = "NO";
        for (int i = 0; i < K; i++){
            int num = Integer.parseInt(st.nextToken()); // 멀티탭 구의 수
            if(num % 2 != 0){ // 홀수이면
                N -= (num + 1) / 2;
            }else{
                N -= num / 2;
            }
            if(N <= 0) {
                answer = "YES";
                break;
            }
        }
        System.out.println(answer);

        br.close();
    }
}