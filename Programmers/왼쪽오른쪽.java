import java.io.IOException;
import java.util.Arrays;

public class 왼쪽오른쪽 {
    public static void main(String[] args) throws IOException {
        String[] str_list = {"r", "u", "l", "r"};
        System.out.println(Arrays.toString(solution(str_list)));
    }

    private static String[] solution(String[] str_list) {
        String[] answer = {};
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                answer = Arrays.copyOf(str_list, i);
                break;
            }else if(str_list[i].equals("r")){
                answer = Arrays.copyOfRange(str_list, i + 1, str_list.length);
                break;
            }
        }
        return answer;
    }
}
