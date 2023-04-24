import java.io.IOException;

public class 약수의합 {
    public static void main(String[] args) throws IOException {
        int N = 12;
        System.out.println(Solution(N));
    }

    private static int Solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                answer += i;
            }
        }
        return answer;
    }

}