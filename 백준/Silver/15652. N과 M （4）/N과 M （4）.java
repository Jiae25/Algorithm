import javax.crypto.CipherOutputStream;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int M;
    private static int[] selected;
    private static BufferedWriter bw;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M];
        solve(1, 0); // start, depth

        bw.close();
        br.close();
    }

    private static void solve(int start, int depth) throws IOException {
        if (depth == M) {
            for(int num : selected){
                bw.write(num + " ");
            }
            bw.write("\n");
            return;
        }
        for(int i = start; i <= N; i++){
            selected[depth] = i;
            solve(start, depth + 1);
            start += 1;
        }
    }
}