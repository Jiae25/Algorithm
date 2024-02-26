import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int[][] map;
    private static boolean[] visited;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 모인 사람의 수

        map = new int[N][N]; // 능력치
        StringTokenizer st;
        for(int i = 0; i < N; i++){ // map 초기화
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited = new boolean[N]; // 팀 나누기 true / false

        for(int i = 1; i < N - 1; i++){ // depth 범위 1 ~ N-1
            createTeam(0, i);
        }

        System.out.println(min);

        br.close();
    }

    private static void createTeam(int start, int depth) { // dfs
        if(depth == 0){
            addAbility();
            return;
        }
        for(int j = start; j < N; j++){
            visited[j] = true;
            createTeam(j + 1, depth - 1);
            visited[j] = false;
        }
    }

    private static void addAbility() {
        int start = 0;
        int link = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(visited[i] && visited[j]) {
                    start += map[i][j];
                } else if(!visited[i] && !visited[j]){
                    link += map[i][j];
                }
            }
        }

        min = Math.min(min, Math.abs(start - link));
    }
}