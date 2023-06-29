import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class 리스트자르기 {
    public static void main(String[] args) throws IOException {
        int n = 3;
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        solution(n, slicer, num_list);
    }

    private static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        switch (n){
            case 1 :
                for(int i = 0; i <= slicer[1]; i++){
                    list.add(num_list[i]);
                }
                // Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
                break;
            case 2 :
                for(int i = slicer[0]; i < num_list.length; i++){
                    list.add(num_list[i]);
                }
                break;
            case 3 :
                for(int i = slicer[0]; i <= slicer[1]; i++){
                    list.add(num_list[i]);
                }
                break;
            case 4 :
                for(int i = slicer[0]; i <= slicer[1]; i+=slicer[2]){
                    list.add(num_list[i]);
                }
                break;
        }
        answer = list.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}
