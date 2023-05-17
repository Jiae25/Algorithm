import java.io.IOException;
import java.util.Arrays;

//행렬의 곱셈
public class 행렬의곱셈 {
    private static boolean valid;

    public static void main(String[] args) throws IOException {
        int[][] arr1 = {{1,4}, {3,2}, {4,1}};
        int[][] arr2 = {{3,3}, {3,3}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));
    }

    private static int[][] solution(int[][] arr1, int[][] arr2) {
        int m = arr1.length;
        int n = arr2[0].length;
        int o = arr1[0].length;
        int[][] answer = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < o; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}

