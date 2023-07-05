import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열만들기6 {
    public static void main(String[] args) throws IOException {
        int[] arr = {0, 1, 1, 1, 0};
        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[] arr) {
        int[] answer = {-1};
        int idx = 0;
        List<Integer> stk = new ArrayList<>();
        while(idx < arr.length){
            if(stk.isEmpty()){
                stk.add(arr[idx++]);
            }else if(stk.get(stk.size() - 1) == arr[idx]){
                stk.remove(stk.size() - 1);
                idx++;
            }else {
                stk.add(arr[idx++]);
            }
        }
        if(!stk.isEmpty()) {
            answer = new int[stk.size()];
            for(int i = 0; i < answer.length; i++){
                answer[i] = stk.get(i);
            }
        }
        return answer;
    }
}

