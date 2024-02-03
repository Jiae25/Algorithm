import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cards = new int[21]; // 1부터 20까지의 수가 저장될 배열

        // 초기화
        for (int i = 1; i <= 20; i++) {
            cards[i] = i;
        }

        // 문제에서 주어진 범위만큼 카드 뒤집기
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            reverse(cards, start, end);
        }

        // 결과 출력
        for (int i = 1; i <= 20; i++) {
            System.out.print(cards[i] + " ");
        }

        br.close();
    }

    // 배열의 일부를 뒤집는 함수
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
