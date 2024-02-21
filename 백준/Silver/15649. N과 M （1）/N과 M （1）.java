import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int M;
    private static int[] selected;
    private static boolean[] visited;
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M];
        visited = new boolean[N + 1];

        // 1~N 까지 자연수 중 중복 없이 M개를 고른 수열
        permutation(0);
        
        bw.flush();
        bw.close();
        br.close();

    }

    private static void permutation(int depth) throws IOException{
        if (depth == M) { // M개를 고른 경우
            for(int num : selected){
                bw.write(num + " ");
            }
            bw.write("\n");
            return;
        }

        for(int i = 1; i <= N; i++){
            if(!visited[i]){
                visited[i] = true;
                selected[depth] = i;
                permutation(depth + 1);
                visited[i] = false;
            }
        }
    }


}