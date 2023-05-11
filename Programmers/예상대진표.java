public class 예상대진표 {
    public static void main(String[] args) {
        int N = 8; // 총 참가자 수
        int A = 4;
        int B = 7;
        System.out.println(solution(N, A, B));
    }
    // A가 B랑 몇번째 라운드에서 만나는지?
    private static int solution(int n, int a, int b)
    {
        int answer = 0;
        while(a != b){
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }
        return answer;
    }
}
