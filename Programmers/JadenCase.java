import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JadenCase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 단어의 첫 문자가 대문자, 그 외는 소문자
        String s = br.readLine();
        System.out.println(Solution(s));
    }
    // for  the last week
    private static String Solution(String s) {
        String answer = "";
        // s를 확인해서 공백 기준 단어 첫번째 대문자로 변경
        String[] word = s.split(" ");
        for (int i = 0; i < word.length; i++){
            if(word[i].length() == 0){
                answer += " ";
            }else{
                String first = word[i].substring(0,1).toUpperCase();
                String last = word[i].substring(1).toLowerCase();
                answer += first + last + " ";
            }
        }
//        System.out.println(s.length()+ " " + answer.length());
        if(s.length() != answer.length()){
            answer = answer.substring(0,answer.length()-1);
        }
//        if(s.charAt(s.length()-1) != ' ')
        return answer;
    }
}
