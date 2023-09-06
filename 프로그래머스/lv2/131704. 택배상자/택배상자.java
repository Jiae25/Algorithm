import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class Solution {
    public int solution(int[] order) {
        Queue<Integer> containerBelt = new LinkedList<>(); // 컨테이너 벨트
        Stack<Integer> tempBelt = new Stack<>(); // 보조 컨테이너 벨트

        for (int i = 1; i <= order.length; i++){ // 컨테이너 벨트에 순서대로 상자 추가
            containerBelt.offer(i);
        }
        for (int i = 0; i < order.length; i++){ // 기사님이 원하는 상자 순서
            int curBox = order[i];
            while(!containerBelt.isEmpty() && containerBelt.peek() < curBox){ // 컨테이너벨트 > 보조벨트
               tempBelt.push(containerBelt.poll());
            }
            if(!containerBelt.isEmpty() && containerBelt.peek() == curBox){ // 컨테이너벨트 > 트럭
                containerBelt.poll();
            }else{
                if(!tempBelt.isEmpty() && tempBelt.peek() == curBox){ // 보조 컨테이너벨트 > 트럭
                    tempBelt.pop();
                }else{
                    return i;
                }
            }
        }
        return order.length;
    }
}