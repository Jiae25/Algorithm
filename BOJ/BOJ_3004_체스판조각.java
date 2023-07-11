import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3004_체스판조각 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        if(N % 2 == 0){
            answer = (N / 2 + 1) * (N / 2 + 1);
        }else{
            answer = (N / 2 + 1) * (N - (N / 2) + 1);
        }
        System.out.println(answer);
    }
}