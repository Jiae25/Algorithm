import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int M, N;
    private static int[][] map;
    private static int[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int day_cnt;
    private static Queue<int[]> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        M = Integer.parseInt(st.nextToken()); // 상자의 가로 칸의 수
        N = Integer.parseInt(st.nextToken()); // 상자의 세로 칸의 수
        map = new int[N][M];
        visited = new int[N][M];
        
        // 상자에 담긴 토마토의 정보
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        queue = new LinkedList<int[]>();
        // 1 = 익은 토마토, 0 = 익지 않은 토마토, -1 = 빈칸
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if(map[i][j] == 1 && visited[i][j] == 0){ // 익은 토마토이고 방문하지 않았을 경우
                    queue.offer(new int[]{i, j}); // 시작 위치를 큐에 추가
                    visited[i][j] = 1; // 시작 위치 방문 처리
                }
            }
        }
        bfs();

        day_cnt = 0;

        // 토마토가 모두 익을 때까지의 최소 날짜를 출력
        boxCheck:
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if(map[i][j] == 0){ // 토마토가 모두 익지는 못하는 상황이면 -1을 출력해야 한다
                    day_cnt = -1;
                    break boxCheck;
                }
                if(map[i][j] > day_cnt){
                    day_cnt = map[i][j] - 1; // map의 값 - 1이 날짜가 된다.
                }
            }
        }
        
        day_cnt = (day_cnt == 1) ? 0 : day_cnt; // 저장될 때부터 모든 토마토가 익어있는 상태이면 0을 출력
        System.out.println(day_cnt);
    }

    private static void bfs() {
        while(!queue.isEmpty()){
            int[] cur = queue.poll(); // 큐에서 현재 위치를 꺼내옴
            int curX = cur[0]; // x 좌표
            int curY = cur[1]; // y 좌표
            // 사방탐색 상하좌우 인전한 위치를 큐에 추가하고 방문처리
            for (int dir = 0; dir < 4; dir++){
                int nx = curX + dx[dir];
                int ny = curY + dy[dir];
                // 이동 가능한 위치인지 확인(토마토의 존재, 상태 확인, 방문)
                if(nx < 0 || nx >= N | ny < 0 || ny >= M){
                    continue;
                }
                if(map[nx][ny] == -1){ // 1 = 익은 토마토, 0 = 익지 않은 토마토, -1 = 빈칸
                    continue;
                }
                if(visited[nx][ny] == 1){ // 방문한 경우
                    continue;
                }
                queue.offer(new int[]{nx, ny});
                map[nx][ny] = map[curX][curY] + 1; // 현재 토마토에서 +1을 해서 최소 날짜를 센다.
                visited[nx][ny] = 1;
            }
        }
    }

}