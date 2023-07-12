import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11966_2의제곱인가 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        while(N != 1){
            if(N % 2 == 1){
                answer = 0;
                break;
            }
            N /= 2;
        }
        if(N == 1) answer = 1;
        System.out.println(answer);
    }
}