import java.io.IOException;
import java.util.Arrays;

/*
제일 작은 수 제거하기
 */
public class 제일작은수제거하기 {
    private static int index;

    public static void main(String[] args) throws IOException {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
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