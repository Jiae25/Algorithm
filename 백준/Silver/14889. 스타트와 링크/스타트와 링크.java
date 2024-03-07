import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int[][] S;
    private static boolean[] visited;
    private static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 축구를 하기 위해 모인 사람의 수. N은 짝수
        S = new int[N][N]; // 능력치
        // i번 사람과 j번 사람이 같은 팀에 속했을 때 팀에 더해지는 능력치
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < N; j++){
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visited = new boolean[N];
        combination(0, 0); // 시작값 인덱스, 선택된 사람수
        System.out.println(minDiff);

    }

    private static void combination(int idx, int cnt) {
        // N/2 로 start 팀과 link 팀으로 나눔
        if(cnt == N / 2){
            int start = 0;
            int link = 0;
            // S배열에서 능력치 계산
            // 각 팀의 능력치의 합
            for (int i = 0; i < N; i++){
                for (int j = 0; j < N; j++){
                    if(visited[i] && visited[j]){ // start 팀
                        start += S[i][j];
                    }else if(!visited[i] && !visited[j]){ // link 팀
                        link += S[i][j];
                    }
                }
            }
            // 팀간의 능력치 차이 계산
            int diff = Math.abs(start-link);
            // start팀과 link팀의 최소 능력차이 구하기
            minDiff = Math.min(diff, minDiff);
            return;
        }
        // 선수 팀 나누기
        for (int i = idx; i < N; i++){
            visited[i] = true; // 선택받은 선수 방문 처리
            combination(i+1, cnt+1); // 시작한 수의 다음 수, 선수 추가
            visited[i] = false; // 방문 처리한 선수 false로 변경

        }
    }
}