import java.io.IOException;
import java.util.Arrays;

public class 그림확대 {
    public static void main(String[] args) throws IOException {
        String[] picture = {"x.x", ".x.", "x.x"};
        int k = 3;
        System.out.println(Arrays.toString(solution(picture, k)));
    }

    private static String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < picture.length; i++){
            for (int j = 0; j < picture[i].length(); j++){
                for (int r = 0; r < k; r++){
                    sb.append(picture[i].charAt(j));
                }
            }
            String line = sb.toString();
            for (int l = k * i; l < k * i + k; l++){
                answer[l] = line;
            }
            sb.delete(0, sb.length());
        }

        return answer;
    }
}