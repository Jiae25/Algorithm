import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int R = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++){
                for (int j = 0; j < R; j++){
                    sb.append(str.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}