import java.util.ArrayList;
import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
public class 나누어떨어지는숫자배열 {
    public static int[] solution(int[] arr, int divisor) {
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

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        solution(arr, divisor);

    }
}