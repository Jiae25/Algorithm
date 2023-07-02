import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2965_캥커루세마리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int answer = 0;
        while(true){
            if(b - a == 1 && c - b == 1){
                break;
            }
            if (b - a >= c - b) {
                int temp = b;
                b--;
                c = temp;
                answer++;
            }else{
                int temp = b;
                b++;
                a = temp;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
