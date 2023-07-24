import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }
        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        if(K == 1){
            for (int i = 0; i < N; i++){
                System.out.println(arr[i]);
            }
        }else if(K == 2){
            for (int i = 0; i < N; i++){
                sb = sb.delete(0, N).append(arr[i]).reverse();
                System.out.println(sb.toString());
            }
        }else if(K == 3){
            for (int i = N - 1; i >= 0; i--){
                System.out.println(arr[i]);
            }
        }
    }
}