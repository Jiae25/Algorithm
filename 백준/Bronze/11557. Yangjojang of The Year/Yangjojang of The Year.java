import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            int N = Integer.parseInt(br.readLine());
            int max = 0;
            String univ = "";
            for(int i = 0; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                String S = st.nextToken();
                int L = Integer.parseInt(st.nextToken());
                if(L > max){
                    max = L;
                    univ = S;
                }
            }
            System.out.println(univ);
        }
    }
}
