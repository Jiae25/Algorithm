import java.io.IOException;
import java.util.Arrays;

public class P_2차원으로만들기 {
    public static void main(String[] args) throws IOException {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        System.out.println(Arrays.deepToString(solution(num_list, n)));

    }

    private static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        for(int i = 0; i < num_list.length; i++){
            answer[i / n][i % n] = num_list[i];
        }
        return answer;
    }
}
