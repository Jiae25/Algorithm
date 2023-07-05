import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 무작위로K개의수뽑기 {
    public static void main(String[] args) throws IOException {
        int[] arr = {0, 1, 1, 2, 2, 3};
        int k = 3;
        System.out.println(Arrays.toString(solution(arr, k)));
    }

    private static int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(!list.contains(arr[i]) && list.size() < k){
                list.add(arr[i]);
            }
        }
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}

