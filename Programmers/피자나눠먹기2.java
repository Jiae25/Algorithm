import java.io.IOException;

public class 피자나눠먹기2 {
    public static void main(String[] args) throws IOException{
        int n = 10;
        System.out.println(solution(6));
    }
    public static int solution(int n) {
        int answer = lcm(n, 6) / 6;
        return answer;
    }
    // 최대공약수(GCD)
    public static int gcd(int a, int b){
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    // 최소공배수(LCM)
    public static int lcm(int a, int b){
        int gcd = gcd(a, b);
        return (a * b) / gcd;
    }
}