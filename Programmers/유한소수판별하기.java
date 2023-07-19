import java.io.IOException;

public class 유한소수판별하기 {
    public static void main(String[] args) throws IOException {
        int a = 12, b = 21;
        System.out.println(solution(a, b));
    }

    private static int solution(int a, int b) {
        int answer = 0;
        for(int i = 2; i <= a; i++){
            if(a % i == 0 && b % i == 0){
                a /= i;
                b /= i;
                i = 1;
            }
        }
        while(b % 2 == 0 || b % 5 == 0){
            if(b % 2 == 0){
                b /= 2;
            }
            if(b % 5 == 0){
                b /= 5;
            }
        }
        answer = b == 1 ? 1 : 2;
        return answer;
    }
}
