import java.io.IOException;

public class 코드처리하기 {
    public static void main(String[] args) throws IOException{
        String code = "abc1abc1abc";
        System.out.println(solution(code));
    }
    public static String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int idx = 0; idx < code.length(); idx++) {
            if (code.charAt(idx) == '1') {
                mode = mode == 1 ? 0 : 1;
                continue;
            }
            if (mode == 0 && idx % 2 == 0) {
                answer += code.charAt(idx);
            } else if (mode == 1 && idx % 2 != 0) {
                answer += code.charAt(idx);
            }
//            System.out.println(mode + " " + idx + " : " + answer);
        }
        if(answer.equals("")) answer = "EMPTY";
        return answer;
    }
}