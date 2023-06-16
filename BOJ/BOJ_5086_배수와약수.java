import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_5086_배수와약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A == 0 && B == 0) break;
            if (A > B && A % B == 0) {
                sb.append("multiple").append("\n");
            }else if(A < B && B % A == 0){
                sb.append("factor").append("\n");
            }else{
                sb.append("neither").append("\n");
            }
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb.toString());
    }
}
