import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int result = pascalTriangle(n, k);
        System.out.println(result);
    }

    private static int pascalTriangle(int row, int col) {
        if (col == 1 || col == row) {
            return 1;
        }

        return pascalTriangle(row - 1, col - 1) + pascalTriangle(row - 1, col);
    }
}