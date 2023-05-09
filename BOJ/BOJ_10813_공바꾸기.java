import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10813_공바꾸기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken()); // 바구니 개수
        int M = Integer.parseInt(st.nextToken()); // 바꾸는 횟수
        int[] num = new int[N+1];
        for (int i = 0; i < num.length; i++){
            num[i] = i;
        }
        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
        }
        for (int i = 1; i < num.length; i++){
            System.out.print(num[i] + " ");
        }

    }
}