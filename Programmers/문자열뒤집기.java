import java.io.IOException;

public class 문자열뒤집기 {
    public static void main(String[] args) throws IOException {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        System.out.println(solution(my_string, s, e));
    }
    private static String solution(String my_string, int s, int e) {
        String answer = my_string;
        StringBuilder sb = new StringBuilder(answer.substring(s, e + 1));
        answer = answer.substring(0, s) + sb.reverse().toString() + answer.substring(e + 1);
        return answer;
    }
}