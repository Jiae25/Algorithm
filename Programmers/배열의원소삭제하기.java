import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class 배열의원소삭제하기 {
    public static void main(String[] args) throws IOException{
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        System.out.println(Arrays.toString(solution(arr, delete_list)));
    }

    private static int[] solution(int[] arr, int[] delete_list) {
//        int[] answer = {};
//        List<Integer> list = new ArrayList<>();
//        for(int a : arr){
//            list.add(a);
//        }
//        for(int d : delete_list){
//            list.remove((Integer)d);
//        }
//        answer = list.stream().mapToInt(x -> x).toArray();
//        return answer;

        List<Integer> list = new ArrayList<>();
        for(int a : arr){
            if(!isExist(delete_list, a)){
                list.add(a);
            }
        }
        int[] answer = list.stream().mapToInt(x -> x).toArray();
        return answer;
    }

    private static boolean isExist(int[] delete_list, int a) {
        for(int del : delete_list){
            if(del == a){
                return true;
            }
        }
        return false;
    }
}