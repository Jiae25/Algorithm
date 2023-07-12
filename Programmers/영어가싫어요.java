import java.io.IOException;

public class 영어가싫어요 {
    public static void main(String[] args) throws IOException {
        String numbers = "onefourzerosixseven";
        System.out.println(solution(numbers));

    }

    private static long solution(String numbers) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < arr.length; i++){
            numbers = numbers.replaceAll(arr[i], String.valueOf(i));
        }
        long answer = Long.parseLong(numbers);
        return answer;
    }
}