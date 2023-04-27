import java.io.IOException;
import java.util.Arrays;
/*
x만큼 간격이 있는 n개의 숫자
 */
public class x만큼간격이있는n개의숫자 {
    public static long[] Solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < n; i++){
            answer[i] = (long)x * (i+1);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        int x = 10;
        int n = 0;
        System.out.println(Arrays.toString(Solution(x, n)));
    }
}