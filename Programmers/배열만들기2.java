import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class 배열만들기2 {
    public static void main(String[] args) throws IOException {
        int l = 5;
        int r = 555;
        solution(l, r);
    }

    private static int[] solution(int l, int r) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++){
            String s = Integer.toString(i);
            if(s.matches("^[05]+$")){
                list.add(i);
            }
        }
        if(list.size() == 0){
            list.add(-1);
        }
        answer = list.stream().mapToInt(x->x).toArray();

        return answer;
    }
}