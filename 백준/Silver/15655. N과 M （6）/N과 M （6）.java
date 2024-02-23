import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int M;
    private static int[] arr;
    private static int[] selected;
    private static boolean[] visited;
    private static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        selected = new int[M];
        visited = new boolean[N];

        solve(0, 0);

        System.out.println(sb.toString());
    }

    private static void solve(int start, int depth) {
        if (depth == M) {
            for(int num : selected){
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = start; i < arr.length; i++){
            selected[depth] = arr[i];
            solve(i + 1, depth + 1);
        }
    }
}