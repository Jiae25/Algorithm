import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int x, int y, int n) {
        if(x == y) return 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        int[] visited = new int[y + 1];
        while (!queue.isEmpty()){
            int current = queue.poll();
            int[] cal = {current + n, current * 2, current * 3};
            for (int i = 0; i < 3; i++){
                if(cal[i] <= y && visited[cal[i]] == 0){
                    queue.offer(cal[i]);
                    visited[cal[i]] = visited[current] + 1;
                }
            }
        }
        int answer = visited[y];
        if(answer == 0) return -1;
        return answer;
    }
}