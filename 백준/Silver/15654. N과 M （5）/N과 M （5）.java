import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw;
    private static int M;
    private static int[] arr;
    private static int[] selected;
    private static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N]; // 주어진 숫자
        selected = new int[M]; // 선택된 수열
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 수열을 사전순으로 증가하는 순서로 출력하기 위해 정렬

        solve(0); // depth

        bw.close();
        br.close();
    }

    private static void solve(int depth) throws IOException {
        if(depth == M){
            for(int num : selected){
                bw.write(num + " ");
            }
            bw.write("\n");
            return;
        }
        for(int i = 0; i < arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                selected[depth] = arr[i];
                solve(depth + 1);
                visited[i] = false;
            }
        }
    }
}