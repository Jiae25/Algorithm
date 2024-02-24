import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N, M, K;
    private static int[][] map;
    private static boolean[][] visited;
    private static int maxSum = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){ // map 초기화
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0, 0);

        System.out.println(maxSum);

        br.close();
    }

    private static void dfs(int x, int y, int selected) {
        if (selected == K) {
            calculateSum();
            return;
        }
        for(int i = x; i < N; i++){
            for(int j = (i == x) ? y : 0; j < M; j++){
                if(!visited[i][j] && !isAdjacentSelected(i, j)){
                    visited[i][j] = true;
                    dfs(i, j, selected + 1);
                    visited[i][j] = false;
                }
            }
        }

    }
    private static boolean isAdjacentSelected(int x, int y) {
        if (x > 0 && visited[x - 1][y]) return true;
        if (x < N - 1 && visited[x + 1][y]) return true;
        if (y > 0 && visited[x][y - 1]) return true;
        if (y < M - 1 && visited[x][y + 1]) return true;
        return false;
    }

    private static void calculateSum() {
        int sum = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(visited[i][j]){
                    sum += map[i][j];
                }
            }
        }
        maxSum = Math.max(maxSum, sum);
    }
}