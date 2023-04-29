import java.io.IOException;
/*
짝수와 홀수 구분하기
 */
public class 짝수와홀수 {
    public static void main(String[] args) throws IOException {
        int num = 3;
        System.out.println(Solution(num));
    }

    private static String Solution(int num) {
        String answer = "";
        if(num % 2 == 0){
            answer = "Even";
        }else{
            answer = "Odd";
        }
        return answer;
    }
}