import java.io.IOException;
import java.util.Arrays;

public class 잘라서배열로저장하기 {
    public static void main(String[] args) throws IOException {
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        System.out.println(Arrays.toString(solution(my_str, n)));
    }

    private static String[] solution(String my_str, int n) {
        int size = my_str.length() % n != 0 ? my_str.length() / n + 1 : my_str.length() / n;
        String[] answer = new String[size];
        for(int i = 0, idx = 0; i < my_str.length(); i += n, idx++){
            int endIdx = Math.min(i + n, my_str.length());
            answer[idx] = my_str.substring(i, endIdx);
        }
        // String[] answer = my_str.split("(?<=\\G.{" + n + "})");
        return answer;
    }
}
