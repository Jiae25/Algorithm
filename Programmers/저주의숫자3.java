import java.io.IOException;

public class 저주의숫자3 {
    public static void main(String[] args) throws IOException {
        int n = 15;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        int tnum = 1;
        int i = 1;
        while(i <= n){
            if(tnum % 3 != 0 && !Integer.toString(tnum).contains("3")){
                answer = tnum;
                i++;
            }
            tnum++;
        }
        return answer;
    }
}