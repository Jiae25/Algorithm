import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int N;
    private static StringBuilder sb = new StringBuilder();
    private static int[] arr;
    private static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visited = new boolean[N];

        permutation(0);

        System.out.println(sb.toString());
        br.close();
    }

    private static void permutation(int depth) {
        if(depth == N){
            for(int num : arr){
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 0; i < N; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i + 1;
                permutation(depth + 1);
                visited[i] = false;
            }
        }
    }
}