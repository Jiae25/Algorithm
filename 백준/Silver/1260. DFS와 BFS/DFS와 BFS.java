import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int N, M, V; // 점점의 개수, 간선의 개수, 탐색을 시작할 정점의 번호
    private static int[][] node; // 인접행렬의 배열
    private static int[] visited; // 노드의 방문여부 표시 배열
    private static int[] dx = {-1, 1, 0, 0}; // 인접한 노드의 상대적인 x 죄표
    private static int[] dy = {0, 0, -1, 1}; // 인접한 노드의 상대적인 y 좌표

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken()); // 정점의 개수 (1<=N<=1000)
        M = Integer.parseInt(st.nextToken()); // 간선의 개수 (1<=M<=10000)
        V = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호

        node = new int[N + 1][N + 1]; // 인접행렬의 배열 초기화
        visited = new int[N+1]; // 노드의 방문여부 표시 배열 초기화

        // 인접행렬 구현
        for (int i = 0; i < M; i++){ // 간선의 개수만큼 반복
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            // 양방향 이동 가능한 그래프
            node[start][end] = 1;
            node[end][start] = 1;
        }
        dfs(V);
        Arrays.fill(visited, 0); // 방문여부 표시 배열 초기화
        System.out.println();
        bfs(V);
    }

    // BFS 알고리즘
    private static void bfs(int v) {
        visited[v] = 1; // 현재 노드를 방문했음을 표시
        Queue<Integer> q = new LinkedList<>(); // 큐를 사용
        q.offer(v); // 큐에 시작 노드 삽입
        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x+" ");
            for (int i = 1; i <= N; i++){
                if(node[x][i] == 1 && visited[i] == 0){
                    visited[i] = 1;
                    q.offer(i);
                }
            }
        }

    }

    // DFS 알고리즘
    private static void dfs(int v) {
        visited[v] = 1; // 현재 노드를 방문했을을 표시
        System.out.print(v+" "); // 현재 노드 출력
        for (int i = 1; i <= N; i++){
            if(node[v][i] == 1 && visited[i] == 0){ // 연결되어있고 && 방문하지 않은 경우
                dfs(i); // 해당 노드로 이동하여 재귀적으로 탐색
            }
        }
    }

}