import java.io.IOException;

public class 치킨쿠폰 {
    public static void main(String[] args) throws IOException {
        int chicken = 1999;
        System.out.println(solution(chicken));
    }

    private static int solution(int chicken) {
        int answer = 0;
        while(chicken >= 10){
            int service = chicken / 10;
            int coupon = chicken % 10;
            chicken = service + coupon;
            answer += service;
        }
        return answer;
    }
}
