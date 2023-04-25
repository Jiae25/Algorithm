import java.io.IOException;

public class 평균구하기 {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Solution(arr));
    }

    private static double Solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        answer /= arr.length;
        return answer;
    }
}