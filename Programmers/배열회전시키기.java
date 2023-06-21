import java.io.IOException;
import java.util.Arrays;


public class 배열회전시키기 {
    public static void main(String[] args) throws IOException{
        int[] numbers = {1, 2, 3};
        String direction= "right";
        System.out.println(Arrays.toString(solution(numbers, direction)));
    }

    private static int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        if(direction.equals("right")){
            int temp = numbers[numbers.length - 1];
            for(int i = numbers.length - 1; i > 0 ; i--){
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = temp;
        }else{
            int temp = numbers[0];
            for(int i = 0; i < numbers.length - 1; i++){
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = temp;
        }

        return numbers;
    }
}