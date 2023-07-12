import java.io.IOException;

public class 이진수더하기 {
    public static void main(String[] args) throws IOException {
        String bin1 = "1001";
        String bin2 = "101111";
        System.out.println(solution(bin1, bin2));
    }

    private static String solution(String bin1, String bin2) {
        String answer = "";
        answer = Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2), 2);
        return answer;
    }

}