/*
하샤드 수
 */
public class Harshad {
    static public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            sum += str.charAt(i) - '0';
        }
        answer = (x % sum == 0) ? true : false;
        return answer;
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(solution(x));
    }
}