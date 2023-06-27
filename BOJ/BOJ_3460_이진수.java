import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3460_이진수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++){
            int n = Integer.parseInt(br.readLine());
            String binary = Integer.toBinaryString(n);
            for (int i = binary.length() - 1; i >= 0; i--){
                if(binary.charAt(i) == '1'){
                    sb.append(Math.abs(i - binary.length() + 1) + " ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}