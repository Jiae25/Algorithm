import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class 모음사전 {
    private static char[] vowel = {'A', 'E', 'I', 'O', 'U'};

    public static void main(String[] args) throws IOException {
        String word = "EIO";
        System.out.println(solution(word));
    }

    private static int solution(String word) {
        int answer = 0;
        ArrayList<String> combinations = new ArrayList<>();
        for (int i = 1; i <= 5; i++){ // 1부터 ~ 모음의 개수까지 조합구하기
            comb("", i, combinations);
        }
        Collections.sort(combinations);
        answer = combinations.indexOf(word) + 1;
        return answer;
    }

    private static void comb(String current, int cnt, ArrayList<String> combinations) { // 조합해보는 문자열 s, 뽑을 개수 cnt
        if(current.length() == cnt){
            combinations.add(current);
            return;
        }
        for (int i = 0; i < vowel.length; i++){
            comb(current + vowel[i], cnt, combinations);
        }
    }
}