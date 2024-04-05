import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 음의 수
        int P = Integer.parseInt(st.nextToken()); // 프렛의 수

        Stack<Integer>[] stacks = new Stack[7]; // 각 줄에 대한 스택 생성
        for (int i = 1; i <= 6; i++) {
            stacks[i] = new Stack<>();
        }

        int count = 0; // 손가락의 움직임 수
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int line = Integer.parseInt(st.nextToken());
            int fret = Integer.parseInt(st.nextToken());

            while (!stacks[line].isEmpty() && stacks[line].peek() > fret) {
                stacks[line].pop(); // 현재 프렛보다 높은 음이 있다면 뺌
                count++; // 손가락을 한번 움직임
            }

            if (stacks[line].isEmpty() || stacks[line].peek() != fret) {
                stacks[line].push(fret); // 현재 프렛이 스택의 최상위 음과 같지 않으면 추가
                count++; // 손가락을 한번 움직임
            }
        }

        System.out.println(count);
        br.close();
    }
}