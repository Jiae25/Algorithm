/*자연수 뒤집어 배열로 만들기
 */
public class 자연수뒤집어배열로만들기 {
    static public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(str.length() - i - 1) - '0';
        }
        return answer;
    }

    public static void main(String[] args) {
        long n = 12345;
        solution(n);
    }
}