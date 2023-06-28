import java.io.IOException;
import java.util.Arrays;

public class 글자지우기 {
    public static void main(String[] args) throws IOException {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(solution(my_string, indices));
    }

    private static String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        Arrays.sort(indices);
        for(int i = indices.length - 1; i >= 0; i--){
            int idx = indices[i];
            sb.deleteCharAt(idx);
        }
        answer = sb.toString();
        return answer;
    }
}
