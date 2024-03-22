import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static ArrayList<Integer>[] graph;
    private static boolean answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 사람의 수
        int M = Integer.parseInt(st.nextToken()); // 친구 관계의 수

        graph = new ArrayList[N]; // 그래프
        for(int i = 0; i < N; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++){ // 간선 정보 입력
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a); // 양방향
        }

        for(int i = 0; i < N; i++){
            boolean[] visited = new boolean[N];
            visited[i] = true;
            dfs(i, 1, visited); // 정점, depth, 방문
            if(answer){
                break;
            }
        }

        System.out.println(answer ? 1 : 0); // 결과 출력

    }

    private static void dfs(int v, int depth, boolean[] visited) {
        if(depth == 5){
            answer = true;
            return;
        }
        for(int next : graph[v]){
            if(!visited[next]){
                visited[next] = true;
                dfs(next, depth + 1, visited);
                visited[next] = false;
            }
        }
    }
}
