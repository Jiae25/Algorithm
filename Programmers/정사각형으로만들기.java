import java.io.IOException;
import java.util.Arrays;

public class 정사각형으로만들기 {
    public static void main(String[] args) throws IOException {
        int[][] arr = {{572, 22, 37}, {287, 726, 384}};
        solution(arr);
    }

    private static int[][] solution(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int max = Math.max(n, m);
        int[][] answer = new int[max][max];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                answer[i][j] = arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(answer));
        return answer;
    }
}