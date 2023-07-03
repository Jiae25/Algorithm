import java.io.IOException;

public class 문자열이몇번등장하는지세기 {
    public static void main(String[] args) throws IOException {
        String myString = "banana";
        String pat = "ana";
        System.out.println(solution(myString, pat));
    }

    private static int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i <= myString.length() - pat.length(); i++){
            String s = myString.substring(i, i + pat.length());
            if(s.equals(pat)) answer++;
        }
        return answer;
    }
}

