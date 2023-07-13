import java.io.IOException;

public class P_7의개수 {
    public static void main(String[] args) throws IOException {
        int[] array = {1, 17, 77, 14757};
        System.out.println(solution(array));
    }

    private static int solution(int[] array) {
        int answer = 0;
        for(int a : array){
            while(a != 0){
                if(a % 10 == 7) {
                    answer += 1;
                }
                a /= 10;
            }
        }
        return answer;
    }
}