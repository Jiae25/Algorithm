import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int bridge_weight = 0;
        int time = 0;
        Queue<Integer> bridge = new LinkedList<>();
        for (int truck : truck_weights){
            while (true) {
                if(bridge.isEmpty()){
                    bridge.offer(truck);
                    bridge_weight += truck;
                    time++;
                    System.out.println(time);
                    break;
                } else if (bridge.size() == bridge_length) { // 다리 통과
                    bridge_weight -= bridge.poll();
                }else {
                    if (bridge_weight + truck <= weight) {
                        bridge.offer(truck);
                        bridge_weight += truck;
                        time++;
                        break;
                    }else{
                        bridge.offer(0); // 다리 무게 초과. 빈자리 0
                        time++;
                    }
                }
            }
        }
        return time + bridge_length;
    }
}