import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1267_핸드폰요금 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int Y = 0, M = 0;
        for (int call : arr){
            Y += call % 30 < 0 ? call / 30 * 10 : call / 30 * 10 + 10;
            M += call % 60 < 0 ? call / 60 * 15 : call / 60 * 15 + 15;
        }
        if (Y < M) {
            System.out.println("Y " + Y);
        }else if(Y > M){
            System.out.println("M " + M);
        }else {
            System.out.println("Y M " + Y);
        }
    }
}