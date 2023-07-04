import java.io.IOException;
import java.util.Arrays;

public class A로B만들기 {
    public static void main(String[] args) throws IOException {
        String before = "olleh";
        String after = "hello";
        System.out.println(solution(before, after));
    }

    private static int solution(String before, String after) {
        int answer = 0;
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        if(Arrays.equals(beforeArr, afterArr)) answer = 1;
        return answer;
    }
}

