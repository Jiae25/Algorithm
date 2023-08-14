import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 1; ;i++){
            if(i * (i + 1) == n - 1) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}