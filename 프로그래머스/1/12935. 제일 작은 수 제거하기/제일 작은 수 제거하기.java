import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        int length = arr.length;
        if(length == 1){
            int[] answer = {-1};
            return answer;
        }
        for (int i = 0; i < length; i++){
            if(arr[i] <= min){
                min = arr[i];
                index = i;
            }
        }

        for (int i = index; i < length-1; i++){
            arr[i] = arr[i+1];
        }
        int[] answer = new int[length-1];
        answer = Arrays.copyOf(arr, arr.length - 1);

        return answer;
    }
}