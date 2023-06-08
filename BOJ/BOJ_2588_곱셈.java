import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2588_곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();
        for (int i = 2; i >= 0; i--){
            System.out.println(A * (B.charAt(i) - '0'));
        }
        System.out.println(A * Integer.parseInt(B));
    }
}
