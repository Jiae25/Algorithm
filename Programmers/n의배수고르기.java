import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class n의배수고르기 {
    public static void main(String[] args) throws IOException{
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        solution(n, numlist);
    }

    private static int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                list.add(numlist[i]);
            }
        }
        // ArrayList를 배열로 변환
        // answer = new int[list.size()];
        // for(int i = 0; i < list.size(); i++){
        //     answer[i] = list.get(i);
        // }

        answer = list.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}