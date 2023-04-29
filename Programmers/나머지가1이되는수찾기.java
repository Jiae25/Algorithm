import java.io.IOException;

public class 나머지가1이되는수찾기 {
    private static int Solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        int n = 10; // 3 <= n <= 1,000,000
        System.out.println(Solution(n));
    }
}