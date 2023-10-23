import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){ // 나누어 떨어질 때
                list.add(arr[i]);
            }
        }
        if(list.size() == 0){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] =list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}