import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14720_우유축제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;
        int pre = 0;
        for (int i = 0; i < N; i++){
            if(pre == arr[i]){
                answer++;
                pre++;
            }
            if(pre == 3) {
                pre = 0;
            }
        }
        System.out.println(answer);
    }
}