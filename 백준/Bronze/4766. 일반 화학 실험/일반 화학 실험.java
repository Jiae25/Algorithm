import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double pre = Double.parseDouble(br.readLine());
        while(true){
            double next = Double.parseDouble(br.readLine());
            if(next == 999) break;
            System.out.printf("%.2f\n", next - pre);
            pre = next;
        }
        br.close();
    }
}