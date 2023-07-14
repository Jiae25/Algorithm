import java.io.IOException;
import java.util.Arrays;

public class OX퀴즈 {
    public static void main(String[] args) throws IOException {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(solution(quiz)));
    }

    private static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            String[] splitArr = quiz[i].split(" ");
            int result = 0;
            if(splitArr[1].equals("+")){
                result = Integer.parseInt(splitArr[0]) + Integer.parseInt(splitArr[2]);
            }else if(splitArr[1].equals("-")){
                result = Integer.parseInt(splitArr[0]) - Integer.parseInt(splitArr[2]);
            }
            answer[i] = result == Integer.parseInt(splitArr[4]) ? "O" : "X";
        }
        return answer;
    }
}