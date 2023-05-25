import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11945_뜨거운붕어빵 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int tc = 0; tc < N; tc++){
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            for (int i = 0; i < M; i++){
                sb.append(s.charAt(i));
            }
            System.out.println(sb.reverse().toString());
        }
    }
}