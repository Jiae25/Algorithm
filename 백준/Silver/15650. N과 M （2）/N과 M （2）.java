import java.io.*;
import java.util.Arrays;
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

        combination(1, 0);

        bw.close();
        br.close();
    }

    private static void combination(int start, int depth) throws IOException {
        if (M == depth) {
            for(int num : selected){
                bw.write(num + " ");
            }
            bw.write("\n");
            return;
        }
        for(int i = start; i <= N; i++){
            selected[depth] = i;
            combination(i + 1, depth + 1); // i 이전의 수는 확인하지 않는다.
        }

    }
}