import java.io.IOException;
import java.util.Arrays;

//H-Index
public class HIndex {

    public static void main(String[] args) throws IOException {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }

    private static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = citations.length - 1; i >= 0; i--){
            if(citations[i] >= citations.length - i){ // 현재 인용 횟수 이상인 논문 수가 인용 횟수보다 크거가 같은 경우
                answer = citations.length - i;
            }
        }
        return answer;
    }
}
