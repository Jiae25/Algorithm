import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int maxPrice;
    private static int[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 상담할 수 있는 기간

        arr = new int[N][2]; // (상담기간, 금액) * N일
        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken()); // 상담기간
            arr[i][1] = Integer.parseInt(st.nextToken()); // 금액
        }

        solve(0, 0); // day, sumPrice

        System.out.println(maxPrice);
    }

    private static void solve(int day, int sumPrice) {
        maxPrice = Math.max(maxPrice, sumPrice); // 최대 수익

        for(int i = day; i < N; i++){
            if (day + arr[i][0] <= N) { // 다음 날짜가 N 이하일때
                solve(day + arr[i][0], sumPrice + arr[i][1]); // 다음 날짜, 금액 합계
            }
            day++;
        }
    }
}