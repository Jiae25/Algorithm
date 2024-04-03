import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] map;
    private static int[] dx = {0, 0, -1, 1}; // 동서북남
    private static int[] dy = {1, -1, 0, 0}; // 동서북남
    private static int[] dice;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 세로
        int M = Integer.parseInt(st.nextToken()); // 가로
        int x = Integer.parseInt(st.nextToken()); // 주사위 좌표
        int y = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()); // 명령의 개수

        map = new int[N][M];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dice = new int[6]; // 주사위
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " "); // 명령
        for(int k = 0; k < K; k++){
            int dir = Integer.parseInt(st.nextToken()); // 이동방향 (동: 1, 서: 2, 북: 3, 남: 4)
            int nx = x + dx[dir - 1];
            int ny = y + dy[dir - 1];

            if(nx < 0 || nx >= N || ny < 0 || ny >= M){
                continue; // 범위 벗어나는 경우
            }
            // 주사위 굴리기
            moveDice(dir);

            sb.append(dice[0]).append("\n");

            if(map[nx][ny] == 0){
                map[nx][ny] = dice[5];
            }else {
                dice[5] = map[nx][ny];
                map[nx][ny] = 0;
            }

            x = nx;
            y = ny;
        }
        br.close();
        System.out.println(sb.toString());

    }

    private static void moveDice(int dir) {
        int temp = dice[5]; // 바닥

        if (dir == 1) { // 동
            dice[5] = dice[2];
            dice[2] = dice[0];
            dice[0] = dice[3];
            dice[3] = temp;
        } else if (dir == 2) { // 서
            dice[5] = dice[3];
            dice[3] = dice[0];
            dice[0] = dice[2];
            dice[2] = temp;
        } else if (dir == 3) { // 북
            dice[5] = dice[1];
            dice[1] = dice[0];
            dice[0] = dice[4];
            dice[4] = temp;
        }else{ // 남
            dice[5] = dice[4];
            dice[4] = dice[0];
            dice[0] = dice[1];
            dice[1] = temp;
        }
    }
}