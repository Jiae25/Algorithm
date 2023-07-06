import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(solution(maps));
    }
    private static int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];

            if(x == n - 1 & y == m - 1){
                return distance;
            }
            for (int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m || maps[nx][ny] == 0){
                    continue;
                }
                if(!visited[nx][ny]){
                    queue.offer(new int[]{nx, ny, distance + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;
    }
}