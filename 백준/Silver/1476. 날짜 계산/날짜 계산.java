import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        while (E != S || S != M) { // E == S && S == M 이면 while 종료
            int max = Math.max(E, Math.max(S, M));
            if(E < max){
                E += 15;
            }
            if (S < max) {
                S += 28;
            }
            if (M < max) {
                M += 19;
            }
        }

        System.out.println(E); 

        br.close();
    }
}