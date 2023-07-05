import java.io.IOException;
import java.util.Arrays;

public class 배열의길이를2의거듭제곱으로만들기 {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[] arr) {
        int[] answer = {};
        int minLength = 1;
        while(minLength < arr.length){
            minLength *= 2;
        }
        answer = new int[minLength];
        for (int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}

