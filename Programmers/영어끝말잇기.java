import java.util.Arrays;
import java.util.HashSet;
/*
가장 먼저 탈락하는 사람의 번호
그 사람이 몇 번째 차례에 탈락하는지 구하기
 */
public class 영어끝말잇기 {
    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0}; // 번호, 차례
        HashSet<String> set = new HashSet<>();
        char last = words[0].charAt(words[0].length()-1);
        set.add(words[0]);

        for (int i = 1; i < words.length; i++){
            if(last != words[i].charAt(0) || set.contains(words[i])){ // 먼저 단어의 마지막 글자랑 다음 단어의 첫 글자 비교하기
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }else{
                set.add(words[i]);
                last = words[i].charAt(words[i].length()-1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println(Arrays.toString(solution(n, words)));
    }
}