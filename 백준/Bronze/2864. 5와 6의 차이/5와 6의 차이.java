import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        br.close();
        String A = input[0];
        String B = input[1];
        int minVal = toMinValue(A) + toMinValue(B);
        int maxVal = toMaxValue(A) + toMaxValue(B);

        System.out.println(minVal + " " + maxVal);
    }
    // 5를 6으로 바꾸는 함수
    private static int toMinValue(String num) {
        return Integer.parseInt(num.replace('6', '5'));
    }

    // 6을 5로 바꾸는 함수
    private static int toMaxValue(String num) {
        return Integer.parseInt(num.replace('5', '6'));
    }
}