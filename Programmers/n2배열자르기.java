// n^2 배열자르기
import java.io.IOException;
import java.util.Arrays;

public class n2배열자르기 {
    public static void main(String[] args) throws IOException {
        int n = 3;
        long left = 2;
        long right = 5;
        solution(n, left, right);
    }

    private static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];
        int idx = 0;
        for (long i = left; i <= right; i++){
            long r = i / n;
            long c = i % n;
            answer[idx++] = (int) Math.max(r, c) + 1;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}