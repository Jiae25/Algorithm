import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2407 {
    private static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        System.out.println(combination(N, M));
    }

    private static int combination(int n, int m) {
        if(n == m || m == 0){
            return 1;
        }else{
            return combination(n-1, m-1) + combination(n-1, m);
        }
    }
}
