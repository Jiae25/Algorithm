import java.util.ArrayList;
 
class Solution {
    private static int[][] arr;
    private static int min;
    public int solution(int n, int[][] wires) {
        arr = new int[n + 1][n + 1];
        min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++){
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }
        for (int i = 0; i < n - 1; i++){
            int a = wires[i][0];
            int b = wires[i][1];
            arr[a][b] = 0;
            arr[b][a] = 0;

            int group1 = dfs(1, new boolean[n + 1]);
            int group2 = n - group1;
            int diff = Math.abs(group1 - group2);
            min = Math.min(min, diff);

            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        return min;
    }
 
    private static int dfs(int node, boolean[] visited) {
        visited[node] = true;
        int cnt = 1;
        for (int i = 1; i < arr[node].length; i++){
            if(arr[node][i] == 1 && !visited[i]){
                cnt += dfs(i, visited);
            }
        }
        return cnt;
    }
}