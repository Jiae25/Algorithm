import java.io.IOException;
import java.util.Arrays;

public class P_2의영역 {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 2, 1, 4, 5, 2, 9};
        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[] arr) {
        int startIdx = 0, endIdx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                startIdx = i;
                break;
            }
        }
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == 2){
                endIdx = i;
                break;
            }
        }
        int size = endIdx - startIdx + 1;
        int[] answer = {-1};
        if(endIdx != 0){
            answer = new int[size];
            for(int i = startIdx, idx = 0; i <= endIdx; i++, idx++){
                answer[idx] = arr[i];
            }
        }
        return answer;
    }
}
