import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int N, S;
    static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 수열의 크기
        S = Integer.parseInt(st.nextToken()); // 목표 합

        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        findSubsequence(0, 0);

        // 합이 0인 경우 공집합도 카운트되므로 제외
        if (S == 0) count--;

        System.out.println(count);
        br.close();
    }

    // 부분수열을 찾는 함수
    static void findSubsequence(int idx, int sum) {
        if (idx == N) { // 배열의 끝까지 탐색한 경우
            if (sum == S) { // 목표 합과 같은 경우
                count++; // 부분수열 개수 증가
            }
            return;
        }

        // 현재 인덱스의 수를 선택하는 경우
        findSubsequence(idx + 1, sum + arr[idx]);
        // 현재 인덱스의 수를 선택하지 않는 경우
        findSubsequence(idx + 1, sum);
    }
}
