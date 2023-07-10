import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class 한번만등장한문자 {
    public static void main(String[] args) throws IOException {
        String s = "hello";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";
        char[] str = s.toCharArray();
        Arrays.sort(str);
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char key : map.keySet()){
            if(map.get(key) == 1){
                answer += key;
            }
        }
        return answer;
    }
}