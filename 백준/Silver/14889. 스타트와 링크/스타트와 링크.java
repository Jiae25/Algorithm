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

        visited = new boolean[N];

        createTeam(0, 0); // depth

        System.out.println(min);

        br.close();
    }

    private static void createTeam(int start, int depth) { // dfs
        if(depth == N / 2){
            addAbility(); // 팀별 능력치의 합을 구하는 메서드
            return;
        }
        for(int i = start; i < N; i++){
            visited[i] = true;
            createTeam(i + 1, depth + 1);
            visited[i] = false;
        }
    }

    private static void addAbility() {
        int start = 0;
        int link = 0;

        for(int i = 0; i < N; i++){
            if(visited[i]){

            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(visited[i] && visited[j]) {
                    start += map[i][j];
                }
                if(!visited[i] && !visited[j]){
                    link += map[i][j];
                }
            }
        }

        min = Math.min(min, Math.abs(start - link));
    }
}