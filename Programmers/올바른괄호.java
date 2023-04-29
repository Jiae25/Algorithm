/*
올바른 괄호
 */
public class 올바른괄호 {
    static boolean solution(String s) {
        boolean answer = true;
        int num = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                num++;
            }else{
                num--;
            }
            if(num < 0){
                answer = false;
                break;
            }
        }
        if(num > 0) answer = false;
        return answer;
    }

    public static void main(String[] args) {
        String s = "(()(";
        System.out.println(solution(s));
    }
}