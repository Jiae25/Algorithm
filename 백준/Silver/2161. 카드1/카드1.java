import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            // 제일 위의 카드를 버리고, 그 다음 카드를 맨 아래로 옮김
            System.out.print(queue.poll() + " ");
            queue.offer(queue.poll());
        }

        // 마지막 남은 카드 출력
        System.out.println(queue.poll());
    }
}