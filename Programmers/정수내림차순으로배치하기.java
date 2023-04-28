import java.util.Arrays;
import java.util.Collections;

/*
정수 내림차순으로 배치하기
 */
public class 정수내림차순으로배치하기 {
    static public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        Integer[] arr = new Integer[str.length()];
        for (int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i) - '0';
        }
        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
        }

        answer = Long.parseLong(sb.toString());
        return answer;
    }

    public static void main(String[] args) {
        int n = 118372;
        System.out.println(solution(n));
    }
}