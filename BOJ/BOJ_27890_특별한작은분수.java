import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_27890_특별한작은분수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++){
            if(x % 2 == 0){
                x = (x / 2) ^ 6;
            }else{
                x = (2 * x) ^ 6;
            }
        }
        System.out.println(x);
    }
}
