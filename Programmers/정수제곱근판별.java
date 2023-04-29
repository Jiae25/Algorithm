/*
정수 제곱근 판별
 */
public class 정수제곱근판별 {
    static public long solution(long n) {
        long answer = 0;
        long sqrt = (long) Math.sqrt(n);
        if(sqrt * sqrt == n){
            answer = (long) Math.pow(sqrt+1, 2);
        }else{
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        long n = 3;
        System.out.println(solution(n));
    }
}