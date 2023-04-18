import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
DFS
 */
public class BOJ_1012 {
    private static int M;
    private static int N;
    private static int K;
    private static int[][] map;
    private static int[][] visited;
    private static int worm_cnt;
    private static int[] dr = {-1, 1, 0, 0};
    private static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        // 표준 입력(System.in)으로부터 문자를 입력받기 위해 InputStreamReader와 BufferedReader를 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 입력 받음
        // 테스트 케이스만큼 반복
        for (int tc = 0; tc < T; tc++){
            // StringTokenizer를 사용하여 입력받은 문자열을 공백을 기준으로 분리
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken()); // 배추밭의 가로길이 M(1<=M<=50)
            N = Integer.parseInt(st.nextToken()); // 배추밭의 세로길이 N(1<=M<=50)
            K = Integer.parseInt(st.nextToken()); // 배추가 심어져 있는 위치의 개수 (1<=K<2500)

            map = new int[N][M];
            visited = new int[N][M];

            // 배추의 좌표확인
            for (int k = 0; k < K; k++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
//                System.out.println(x+" "+y);
                // 배열의 형태 확인(가로,세로)
                map[y][x] = 1;
            }

            // 지렁이의 수
            worm_cnt = 0;
            for (int r = 0; r < N; r++){
                for (int c = 0; c < M; c++){
                    // 배추가 있는 곳 && 방문하지 않은 곳 탐색
                    if(map[r][c] == 1 && visited[r][c] == 0){
                        dfs(r, c);
                        worm_cnt++;
                    }
                }
            }

            System.out.println(worm_cnt);

//            // 배추밭 확인
//            for (int i = 0; i < N; i++){
//                for (int j = 0; j < M; j++){
//                    System.out.print(map[i][j]);
//                }
//                System.out.println();
//            }
        }
    }

    private static void dfs(int r, int c) {
        // 방문처리
        visited[r][c] = 1;
        // 사방탐색 상하좌우
        for (int dir = 0; dir < 4; dir++){
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            // 이동 불가한 위치
            if(nr < 0 || nr >= N || nc < 0 || nc >= M){
                continue;
            }
            // 배추가 없는 곳
            if(map[nr][nc] == 0) {
                continue;
            }
            // 방문했던 곳
            if(visited[nr][nc] == 1){
                continue;
            }
            dfs(nr, nc);
        }
    }
}
