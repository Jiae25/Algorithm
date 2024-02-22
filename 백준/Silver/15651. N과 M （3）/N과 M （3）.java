import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw;
    private static int N;
    private static int M;
    private static int[] selected;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M];

        solve(0);

        bw.close();
        br.close();
    }

    private static void solve(int depth) throws IOException {
        if (depth == M) {
            for(int num : selected){
                bw.write(num + " ");
            }
            bw.write("\n");
            return;
        }
        for(int i = 1; i <= N; i++){
            selected[depth] = i;
            solve(depth + 1);
        }
    }
}