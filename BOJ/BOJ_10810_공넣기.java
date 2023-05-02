import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10810_공넣기 {
    private static int N, M;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken()); // 바구니의 총 개수
        M = Integer.parseInt(st.nextToken()); // 공을 넣을 횟수
        arr = new int[N+1];

        for (int cnt = 0; cnt < M; cnt++){
            st = new StringTokenizer(br.readLine()," ");
            // i번 바구니부터 j번 바구니까지 k번 번호기 적혀있는 공을 넣는다.
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for (int num = i; num <= j; num++){
                arr[num] = k;
            }
        }

        for (int i = 1; i <= N; i++){
            System.out.print(arr[i]+" ");
        }
    }
}