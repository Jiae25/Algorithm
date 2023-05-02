/*
숫자의 표현
 */
public class 숫자의표현 {
    static public int solution(int n) {
        int answer = 0;
        // 연속된 자연수 n
        int sum = 0;
        for (int cnt = 1; sum < n; cnt++){
            if((n - sum) % cnt == 0){
                answer++;
            }
            sum += cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n));
    }
}