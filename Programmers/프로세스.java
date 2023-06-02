import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
//프로세스
public class 프로세스 {
    public static void main(String[] args) throws IOException {
        int[] priorities = {1,1,9,1,1,1};
        int location = 0;
        System.out.println(solution(priorities, location));
    }

    private static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++){
            pq.offer(priorities[i]);
        }
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++){
                if(priorities[i] == pq.peek()){
                    answer++;
                    pq.poll();
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
