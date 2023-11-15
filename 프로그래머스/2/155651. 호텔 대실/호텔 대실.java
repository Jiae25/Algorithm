import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < book_time.length; i++){
            int start = stringToInt(book_time[i][0]);
            int end = stringToInt(book_time[i][1]) + 10;
            list.add(new Integer[]{start, end});
        }
        Collections.sort(list,(o1, o2) -> {
            return o1[0] - o2[0];
        });
        PriorityQueue<Integer[]> pq = new PriorityQueue<>(((o1, o2) -> (o1[1] - o2[1])));
        int answer = 0;
        for (int i = 0; i < list.size(); i++){
            Integer[] arr = list.get(i);
            if(pq.isEmpty()){
                pq.add(arr);
            }else if(pq.peek()[1] > arr[0]){ // 끝나는 시간 > 시작시간
                pq.add(arr);
            }else{
                pq.poll();
                pq.add(arr);
            }
            answer = Math.max(answer, pq.size());
        }
        return answer;
    }

    private static int stringToInt(String time) {
        String[] time_str = time.split(":");
        return Integer.parseInt(time_str[0]) * 60 + Integer.parseInt(time_str[1]);
    }
}