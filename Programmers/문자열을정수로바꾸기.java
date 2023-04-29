/*
문자열을 정수로 바꾸기
 */
public class 문자열을정수로바꾸기 {
    static public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        String str = "-4";
        System.out.println(solution(str));
    }
}