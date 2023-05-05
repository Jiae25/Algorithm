import java.io.IOException;
/*
numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 더한 값 구하기
 */
public class 없는숫자더하기 {
    public static void main(String[] args) throws IOException {
        int[] numbers = {5,8,4,0,6,7,9};
        System.out.println(solution(numbers));
    }

    private static int solution(int[] numbers) {
        int answer = 0;
        boolean[] arr = new boolean[10];
        for (int i = 0; i < numbers.length; i++){
            arr[numbers[i]] = true;
        }
        for (int i = 0; i < arr.length; i++){
            if(!arr[i]){
                answer += i;
            }
        }
        return answer;
    }

    public int solution2(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}