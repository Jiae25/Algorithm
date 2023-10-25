import java.util.*;

class Solution {
    private static char[][] map;
    private static boolean[][] visited;
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};
    private static int day;
    
    public int[] solution(String[] maps) {
        map = new char[maps.length][maps[0].length()];
        visited = new boolean[maps.length][maps[0].length()];
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < maps.length; i++){
            map[i] = maps[i].toCharArray();
        }

        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[0].length; j++){
                if(!visited[i][j] && map[i][j] != 'X'){
                    dfs(i, j);
                    answer.add(day);
                    day = 0;
                }
            }
        }

        if(answer.isEmpty()) {
            answer.add(-1);
        }else{
            Collections.sort(answer);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void dfs(int x, int y) {
        day += map[x][y] - '0';
        visited[x][y] = true;
        for (int dir = 0; dir < 4; dir++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if(nx < 0 || nx >= map.length || ny < 0 || ny >= map[0].length){
                continue;
            }
            if(!visited[nx][ny] && map[nx][ny] != 'X'){
                dfs(nx, ny);
            }
        }
    }
}