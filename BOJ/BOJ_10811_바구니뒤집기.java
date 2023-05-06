import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10811_바구니뒤집기 {
    private static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken()); // 바구니의 개수
        M = Integer.parseInt(st.nextToken()); // 역순으로 바꿀 바구니
        int[] baskets = new int[N+1]; // 바구니 1부터 시작
        for (int i = 1; i <= N; i++){
            baskets[i] = i;
        }
        for (int m = 0; m < M; m++){
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            // 시작 인덱스와 끝 인덱스를 서로 바꿔가며 값을 업데이트
            for (int i = start, j = end; i < j; i++, j--){
                int temp = baskets[i];
                baskets[i] = baskets[j];
                baskets[j] = temp;
            }
        }
        for (int i = 1; i <= N; i++){
            System.out.print(baskets[i] + " ");
        }
    }
}