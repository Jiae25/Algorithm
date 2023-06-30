import java.io.IOException;
import java.util.Arrays;

public class 배열조각하기 {
    public static void main(String[] args) throws IOException {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        System.out.println(Arrays.toString(solution(arr, query)));
    }

    private static int[] solution(int[] arr, int[] query) {
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                arr = Arrays.copyOf(arr, query[i] + 1);
            }else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }
}
