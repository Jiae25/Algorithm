import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class 배열만들기4 {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 4, 2, 5, 3};
        solution(arr);
    }

    private static int[] solution(int[] arr) {
        int[] stk = {};
        List<Integer> stkList = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            if(stkList.isEmpty()){
                stkList.add(arr[i]);
                i++;
            }else{
                if(stkList.get(stkList.size() - 1) < arr[i]){
                    stkList.add(arr[i]);
                    i++;
                }else{
                    stkList.remove(stkList.size() - 1);
                }
            }
        }
        stk = new int[stkList.size()];
        for(int idx = 0; idx < stk.length; idx++){
            stk[idx] = stkList.get(idx);
        }

        return stk;
    }
}