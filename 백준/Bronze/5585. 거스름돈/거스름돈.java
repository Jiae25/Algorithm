import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 1000 - Integer.parseInt(br.readLine());
        int[] coins = {500, 100, 50, 10, 5, 1};
        int answer = 0;
        for (int i = 0; i < 6; i++){
            answer += (x / coins[i]);
            x %= coins[i];
        }
        System.out.println(answer);
    }
}