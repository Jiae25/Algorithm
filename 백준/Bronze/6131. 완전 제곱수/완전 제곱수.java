import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 1; i <= 1000; i++){
            if(Math.sqrt(i * i + n) % 1.0 == 0.0){
                answer++;
            }
        }
        System.out.println(answer);
    }
}