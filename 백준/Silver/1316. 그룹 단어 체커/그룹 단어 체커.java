import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 단어의 개수
        int count = 0; // 그룹 단어의 개수
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            Set<Character> set = new HashSet<>(); // 문자의 중복을 체크하기 위한 Set
            boolean isGroupWord = true; // 그룹 단어 여부를 판단하는 변수
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (set.contains(ch)) {
                    // 이미 나온 문자인데 연속으로 나오지 않는 경우, 그룹 단어가 아님
                    if (word.charAt(j - 1) != ch) {
                        isGroupWord = false;
                        break;
                    }
                } else {
                    set.add(ch);
                }
            }
            if (isGroupWord) {
                count++;
            }
        }
        System.out.println(count);
    }
}