import java.io.IOException;
import java.math.BigInteger;


public class 구슬을나누는경우의수 {
    public static void main(String[] args) throws IOException {
        int balls = 3;
        int share = 2;
        System.out.println(solution(balls, share));
    }
    // 서로 다른 n개 중 m개를 뽑는 경우의 수
    // n! / ((n-m)! * m!)
    // nPr / r! = n! / (n-r)! / r!
    private static int solution(int balls, int share) {
        int answer = 0;
        BigInteger num = BigInteger.ONE;
        for (int i = balls; i > share; i--){
            num = num.multiply(BigInteger.valueOf(i));
        }
        for (int i = balls - share; i > 0; i--){
            num = num.divide(BigInteger.valueOf(i));
        }
        answer = num.intValue();
        return answer;
    }
}
