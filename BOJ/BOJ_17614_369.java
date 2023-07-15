import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17614_369 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 3; i <= n; i++){
            int num = i;
            while(num > 1){
                int remainder = num % 10;
                if(remainder == 3 || remainder == 6 || remainder == 9) answer++;
                num /= 10;
            }
        }
        System.out.println(answer);
    }
}
