import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11721_열개씩끊어출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int div = s.length() / 10;
        for (int i = 0; i < div; i++){
            System.out.println(s.substring(i * 10, i * 10 + 10));
        }
        System.out.println(s.substring(div * 10));
    }
}
