import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int k;
    static char[] signs;
    static boolean[] visited;
    static StringBuilder minResult, maxResult;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        signs = new char[k];
        visited = new boolean[10];
        minResult = new StringBuilder();
        maxResult = new StringBuilder();

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < k; i++) {
            signs[i] = input[i].charAt(0);
        }

        findMin(0, "");
        findMax(0, "");

        System.out.println(maxResult);
        System.out.println(minResult);
    }

    // 최소 수열 찾기
    static void findMin(int depth, String num) {
        if (depth == k + 1) {
            if (minResult.length() == 0 || num.compareTo(minResult.toString()) < 0) {
                minResult = new StringBuilder(num);
            }
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (!visited[i] && (depth == 0 || check(num.charAt(depth - 1), (char) (i + '0'), signs[depth - 1]))) {
                visited[i] = true;
                findMin(depth + 1, num + i);
                visited[i] = false;
            }
        }
    }

    // 최대 수열 찾기
    static void findMax(int depth, String num) {
        if (depth == k + 1) {
            if (maxResult.length() == 0 || num.compareTo(maxResult.toString()) > 0) {
                maxResult = new StringBuilder(num);
            }
            return;
        }

        for (int i = 9; i >= 0; i--) {
            if (!visited[i] && (depth == 0 || check(num.charAt(depth - 1), (char) (i + '0'), signs[depth - 1]))) {
                visited[i] = true;
                findMax(depth + 1, num + i);
                visited[i] = false;
            }
        }
    }

    // 부등호 조건 확인
    static boolean check(char a, char b, char sign) {
        return (sign == '<' && a < b) || (sign == '>' && a > b);
    }
}