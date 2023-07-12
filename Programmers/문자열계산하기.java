import java.io.IOException;

public class 문자열계산하기 {
    public static void main(String[] args) throws IOException {
        String my_string = "3 + 4 - 5 - 2 - 100 + 120 + 6";
        System.out.println(solution(my_string));
    }

    private static int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");
        String sign = "+";
        for (int i = 0; i < str.length; i++){
            if(str[i].equals("+")){
                sign = "+";
                continue;
            }else if(str[i].equals("-")){
                sign = "-";
                continue;
            }
            if(sign.equals("+")){
                answer += Integer.parseInt(str[i]);
            }else{
                answer -= Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}