import java.io.IOException;
import java.util.LinkedHashSet;


public class 중복된문자제거 {
    public static void main(String[] args) throws IOException{
        String my_string = "people";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for(String s : arr){
            linkedHashSet.add(s);
        }
        for(String s : linkedHashSet){
            answer += s;
        }
        return answer;
    }
}