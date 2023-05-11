public class 점프와순간이동 {
    public static void main(String[] args) {
        int N = 5; // 이동할 거리
        System.out.println(solution(N));
    }
    // K 점프(건전지-) / 순간이동 = 이동거리 * 2
    private static int solution(int n) {
        int ans = 0; // 건전지 사용량(최소)

        while(n > 0){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n--;
                ans++;
            }
        }
        return ans;
    }
}
