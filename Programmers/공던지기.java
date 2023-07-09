import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class 공던지기 {
    public static void main(String[] args) throws IOException {
        int[] numbers = {1, 2, 3};
        int k = 3;
        System.out.println(solution(numbers, k));
    }

    private static int solution(int[] numbers, int k) {
        int answer = 0;
        int length = numbers.length;
        List<Integer> list = new ArrayList<>();
        if(length % 2 == 0){ // numbers 의 길이가 짝수일때
            for (int i = 0; i < length; i+=2){ //  반복되는 list
                list.add(numbers[i]);
            }
        }else{ // numbers 의 길이가 홀수일때
            for (int i = 0; i < length; i+=2){
                list.add(numbers[i]);
            }
            for (int i = 1; i < length; i+=2){
                list.add(numbers[i]);
            }
        }
        int size = list.size();
        answer = k % size == 0 ? list.get(size - 1) : list.get(k % size - 1);
        return answer;
    }
}