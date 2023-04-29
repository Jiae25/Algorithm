import java.io.IOException;

public class 자릿수더하기 {


    public static void main(String[] args) throws IOException {
        int N = 123;
        System.out.println(Solution(N));
    }

    private static int Solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        for (int i = 0; i < num.length(); i++){
            answer += num.charAt(i) - '0';
        }
        return answer;
    }

}