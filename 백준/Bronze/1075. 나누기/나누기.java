import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        N = (N / 100) * 100; // 뒤 두자리를 00으로 만듦
        for (int i = 0; i < 100; i++){
            if((N + i) % F == 0){
                if(i < 10){
                    System.out.println("0" + i);
                }else{
                    System.out.println(i);
                }
                break;
            }
        }
        br.close();
    }
}