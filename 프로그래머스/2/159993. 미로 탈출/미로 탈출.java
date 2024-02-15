import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private static char[][] maze;
    private static int[] dx = {-1, 0, 1, 0}; // 왼위오아
    private static int[] dy = {0, -1, 0, 1};
    
    public int solution(String[] maps) {
        maze = new char[maps.length][maps[0].length()];

        for(int i = 0; i < maps.length; i++){ // 미로입력
            maze[i] = maps[i].toCharArray();
        }

        int[] start = new int[2];
        int[] lever = new int[2];
        for (int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[0].length; j++){
                if(maze[i][j] == 'S'){ // 시작지점
                    start = new int[]{i, j};
                }
                if(maze[i][j] == 'L'){ // 레버
                    lever = new int[]{i, j};
                }
            }
        }

        int toLever = bfs(start, 'L');
        int toEnd = bfs(lever, 'E');
        if (toLever == -1 || toEnd == -1) {
            return -1;
        }

        int answer = toLever + toEnd;
        return answer;
    }
    
    private static int bfs(int[] start, char end) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start[0], start[1], 0}); // x, y, count

        boolean[][] visited = new boolean[maze.length][maze[0].length];

        while(!queue.isEmpty()){
            int x = queue.peek()[0];
            int y = queue.peek()[1];
            int count = queue.peek()[2];

            if(maze[x][y] == end){ // end에 도착
                return count;
            }

            visited[x][y] = true;

            queue.poll();
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= maze.length || ny < 0 || ny >= maze[0].length) {
                    continue;
                }
                if (!visited[nx][ny] && maze[nx][ny] != 'X') {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, count + 1});
                }
            }
        }
        return -1;
    }
}