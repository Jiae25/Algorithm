import java.io.IOException;

public class 문자열묶기 {
    public static void main(String[] args) throws IOException {
        String[] strArr = {"a","bc","d","efg","hi"};
        System.out.println(solution(strArr));
    }

    private static int solution(String[] strArr) {
        int answer = 0;
        int[] length = new int[31];
        for(int i = 0; i < strArr.length; i++){
            length[strArr[i].length()]++;
        }
        for(int i = 1; i < 31; i++){
            answer = Math.max(answer, length[i]);
        }
        return answer;
    }
}

