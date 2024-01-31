import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 로프의 개수
        int[] ropes = new int[N];

        // 입력 받은 로프의 중량 정보를 배열에 저장
        for (int i = 0; i < N; i++) {
            ropes[i] = scanner.nextInt();
        }

        // 중량이 큰 순서대로 정렬
        Arrays.sort(ropes);

        int maxWeight = 0;

        // 각 로프를 사용했을 때 들어올릴 수 있는 최대 중량 계산
        for (int i = 0; i < N; i++) {
            int currentWeight = ropes[i] * (N - i);
            maxWeight = Math.max(maxWeight, currentWeight);
        }

        System.out.println(maxWeight);
    }
}