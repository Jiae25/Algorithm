import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] count = new int[10]; // 0부터 9까지의 숫자 개수를 저장하는 배열

        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i) - '0';
            count[num]++;
        }

        // 6과 9는 서로 대체 가능하므로 두 수의 개수를 합친 후 2로 나눠줌
        int sixNineCount = count[6] + count[9];
        count[6] = count[9] = (sixNineCount + 1) / 2;

        int maxSetCount = 0;
        for (int i = 0; i < 10; i++) {
            maxSetCount = Math.max(maxSetCount, count[i]);
        }

        System.out.println(maxSetCount);
    }
}