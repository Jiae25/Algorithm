// 다음 큰 숫자
public class 다음큰숫자 {
    public static int solution(int n) {
        int answer = n + 1; // 다음 숫자..
        int oneCnt = Integer.bitCount(n); // 현재 n을 이진수로 변환 후 1의 개수
        while(oneCnt != Integer.bitCount(answer)){
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 78;
        System.out.println(solution(n));

    }
}