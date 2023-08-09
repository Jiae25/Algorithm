import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++){
            int d = Integer.parseInt(br.readLine());
            int s = 0;
            while(s + s * s <= d){
                s += 1;
            }
            System.out.println(s - 1);
        }
    }
}