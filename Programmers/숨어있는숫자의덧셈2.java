import java.io.IOException;

public class 숨어있는숫자의덧셈2 {
    public static void main(String[] args) throws IOException {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }

    private static int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("[a-zA-z]");
        for (int i = 0; i < str.length; i++){
            if(str[i].length() > 0){
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}