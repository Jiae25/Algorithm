import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] graph;
    static int[] visited;
    static boolean bipartite;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            graph = new ArrayList[V + 1];
            visited = new int[V + 1];
            bipartite = true;

            for (int i = 1; i <= V; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph[u].add(v);
                graph[v].add(u);
            }

            for (int i = 1; i <= V; i++) {
                if (visited[i] == 0) {
                    bfs(i);
                }
            }

            System.out.println(bipartite ? "YES" : "NO");
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = 1;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int next : graph[node]) {
                if (visited[next] == 0) {
                    visited[next] = 3 - visited[node]; // 다음 노드의 그룹을 현재 노드와 다른 그룹으로 설정
                    queue.offer(next);
                } else if (visited[next] == visited[node]) {
                    bipartite = false;
                    return;
                }
            }
        }
    }
}