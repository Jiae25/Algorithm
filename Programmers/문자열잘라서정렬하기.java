import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열잘라서정렬하기 {
    public static void main(String[] args) throws IOException{
        String myString = "xxzasdf";
        System.out.println(Arrays.toString(solution(myString)));
    }

    private static String[] solution(String myString) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        String[] arr = myString.split("x");
        Arrays.sort(arr);
        for(String s : arr){
            if(!s.equals("")){
                list.add(s);
            }
        }
        answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}