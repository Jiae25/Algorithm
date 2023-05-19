import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_25372_성택이의은밀한비밀번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            String pw = br.readLine();
            if(pw.length() >= 6 && pw.length() <=9){
                sb.append("yes");
            }else{
                sb.append("no");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}

