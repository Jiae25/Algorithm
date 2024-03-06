import java.io.*;
import java.util.*;

public class Main {
    private static int N;
    private static int[][] map;
    private static int[] selected;
    private static boolean[] visited;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        selected = new int[N];
        visited = new boolean[N];

        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        permute(0);

        System.out.println(min);

        br.close();
    }

    private static void permute(int depth) {
        if (depth == N) {
            min = Math.min(min, calculate(selected));
            return;
        }
        for(int i = 0; i < selected.length; i++){
            if(!visited[i]){
                visited[i] = true;
                selected[depth] = i; // 외판원이 지나갈 도시의 순서
                permute(depth + 1);
                visited[i] = false;
            }
        }
    }

    private static int calculate(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(map[arr[i]][arr[i+1]] == 0){ // 갈 수 없는 경우
                return Integer.MAX_VALUE;
            }
            sum += map[arr[i]][arr[i+1]];
        }
        
        if(map[arr[arr.length - 1]][arr[0]] == 0){ // 원래의 도시와 연결이 되어있지 않을 떄 
            return Integer.MAX_VALUE;
        }
        sum += map[arr[arr.length - 1]][arr[0]]; // 원래의 도시로 돌아오는 값
        return sum;
    }
}