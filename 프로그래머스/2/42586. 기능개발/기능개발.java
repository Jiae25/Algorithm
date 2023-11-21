import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++){
            int days = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                days++;
            }
            queue.offer(days);
        }
        int preDays = 0;
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            int days = queue.poll();
            if (days > preDays) {
                if(cnt > 0){
                    list.add(cnt);
                    cnt = 0;
                }
                preDays = days;
            }
            cnt++;
        }
        list.add(cnt);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
//        System.out.println(Arrays.toString(answer));
        return answer;
    }
}