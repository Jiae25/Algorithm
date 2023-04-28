/*
문자열 내 p와 y의 개수
 */
public class 문자열내p와y의개수 {
    static boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        int num = 0;
        for (int i = 0; i < length; i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                num++;
            }else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                num--;
            }
        }
        answer = (num == 0) ? true : false;

        return answer;
    }

    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(solution(s));
    }
}