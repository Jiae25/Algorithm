import java.io.IOException;
// 최대공약수와 최소공배수
public class 최대공약수와최소공배수 {
    public static void main(String[] args) throws IOException {
        int n = 2;
        int m = 5;
        solution(n, m);
    }

    private static int[] solution(int n, int m) {
        System.out.println(gcd(n, m)); // 최대공약수
        System.out.println(lcm(n, m)); // 최소공배수
        int[] answer = {};
        return new int[]{gcd(n, m), lcm(n, m)};
    }

    private static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }

    private static int gcd(int n, int m) {
        if(m == 0){
            return n;
        }
        return gcd(m, n % m);
    }
}

