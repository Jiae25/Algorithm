import java.io.IOException;

public class 삼각형의완성조건2 {
    public static void main(String[] args) throws IOException {
        int[] sides = {11, 7};
        System.out.println(solution(sides));
    }

    private static int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int answer = Math.max(a, b) - Math.abs(a - b) + a + b - Math.max(a, b) - 1;
        return answer;
    }
}
