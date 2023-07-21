import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1;;i++){
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;
            String check = "";
            int num = 0;
            if((n - 1) % 2 == 0){
                check = "odd";
                num = (n - 1) / 2;
            }else{
                check = "even";
                num = (n - 1) / 2 + 1;
            }
            sb.append(i + ". " + check + " " + num + "\n");
        }
        System.out.println(sb.toString());
    }
}