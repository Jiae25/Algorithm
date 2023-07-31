import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int idx = 1;
        while(n != 1){
            idx++;
            if (n % 2 == 0) {
                n /= 2;
            }else{
                n = 3 * n + 1;
            }
        }
        System.out.println(idx);
    }
}