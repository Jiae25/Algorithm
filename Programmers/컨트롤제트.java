import java.io.IOException;

public class 컨트롤제트 {
    public static void main(String[] args) throws IOException {
        String s = "10 Z 20 Z";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++){
            if(str[i].equals("Z")){
                answer -= Integer.parseInt(str[i - 1]);
            }else{
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }

}