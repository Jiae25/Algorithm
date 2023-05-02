/*
두 정수 사이의 합
 */
public class 두정수사이의합 {
    static public long solution(int a, int b) {
        long answer = 0;

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i = min; i <= max; i++){
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(solution(a, b));
    }
}