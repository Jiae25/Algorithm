import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int N, M;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];
        for(int i = 0; i < N; i++){ // map 초기화
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int year = 0;
        while(true){
            int iceberg = getIcebergCnt(); // dfs 빙산 개수 체크

            if(iceberg >= 2){ // 빙산 2개 이상
                break;
            }else if(iceberg == 0){ //  빙산이 다 녹을 때까지 분리되지 않으면 0을 출력
                year = 0;
                break;
            }

            bfs(); // 빙산 녹이기
            year++;
        }

        System.out.println(year);
    }

    private static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(map[i][j] != 0){
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        while(!queue.isEmpty()){
            int[] q = queue.poll();
            int x = q[0];
            int y = q[1];

            int zeroCnt = 0; // 방향 돌릴때마다 체크
            for(int dir = 0; dir < 4; dir++){
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if(nx < 0 || nx >= N || ny < 0 || ny >= M){
                    continue;
                }

                if(map[nx][ny] == 0 && !visited[nx][ny]) { // 방문체크
                    zeroCnt++;
                }
            }

            map[x][y] = (map[x][y] - zeroCnt) < 0 ? 0 : (map[x][y] - zeroCnt);
        }
    }

    private static int getIcebergCnt() {
        int cnt = 0;
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(!visited[i][j] && map[i][j] != 0){
                    visited[i][j] = true;
                    dfs(i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static void dfs(int x, int y) {
        for(int dir = 0; dir < 4; dir++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(nx < 0 || nx >= N || ny < 0 || ny >= M){
                continue;
            }

            if(map[nx][ny] != 0 && !visited[nx][ny]){
                visited[nx][ny] = true;
                dfs(nx, ny);
            }
        }
    }

}