import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N, M;
    private static int[][] map;
    private static boolean[][] visited;
    private static int maxSum;
    private static int[] dx = {-1, 1, 0, 0}; // 위, 아래, 왼, 오
    private static int[] dy = {0, 0, -1, 1}; // 위, 아래, 왼, 오


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for(int i = 0; i < N ;i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited = new boolean[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                visited[i][j] = true;
                dfs(i, j, 1, map[i][j]); // 나중에 매개변수 변경하고 해봐야지
                visited[i][j] = false;
                checkException(i, j);
            }
        }

        System.out.println(maxSum);
    }

    private static void checkException(int x, int y) {
        // ㅏ (x-1, y)
        //    (x, y) (x, y+1)
        //    (x+1, y)
        if (x >= 1 && x < N - 1 && y >= 0 && y < M - 1) {
            int sum = map[x-1][y] + map[x][y] + map[x][y+1] + map[x+1][y];
            maxSum = Math.max(maxSum, sum);
        }
        // ㅜ (x, y-1) (x, y) (x, y+1)
        //             (x+1, y)
        if (x >= 0 && x < N - 1 && y >= 1 && y < M - 1) {
            int sum = map[x][y-1] + map[x][y] + map[x][y+1] + map[x+1][y];
            maxSum = Math.max(maxSum, sum);
        }
        // ㅓ     (x-1, y)
        // (x, y-1)(x, y)
        //        (x+1, y)
        if (x >= 1 && x < N - 1 && y >= 1 && y < M) {
            int sum = map[x-1][y] + map[x][y-1] + map[x][y] + map[x+1][y];
            maxSum = Math.max(maxSum, sum);
        }
        // ㅗ     (x-1, y)
        // (x, y-1) (x,y) (x, y+1)
        if (x >= 1 && x < N && y >= 1 && y < M - 1) {
            int sum = map[x-1][y] + map[x][y-1] + map[x][y] + map[x][y+1];
            maxSum = Math.max(maxSum, sum);
        }
    }

    private static void dfs(int x, int y, int depth, int sum) {
        if(depth == 4){
            maxSum = Math.max(maxSum, sum);
            return;
        }

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny]) {
                visited[nx][ny] = true;
                dfs(nx, ny, depth + 1, sum + map[nx][ny]);
                visited[nx][ny] = false;
            }
        }
    }
}