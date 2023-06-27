import java.io.IOException;

public class qrcode {
    public static void main(String[] args) throws IOException {
        String code = "qjnwezgrpirldywt";
        int q = 3;
        int r = 1;
        System.out.println(solution(q, r, code));
    }
    private static String solution(int q, int r, String code) {
        String answer = "";
        for(int i = r; i < code.length(); i += q){
            answer += code.charAt(i);
        }
        return answer;
    }
}