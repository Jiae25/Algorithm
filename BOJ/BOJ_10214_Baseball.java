import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10214_Baseball {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++){
            int Y = 0, K = 0;
            for (int i = 0; i < 9; i++){
                StringTokenizer st =new StringTokenizer(br.readLine()," ");
                Y += Integer.parseInt(st.nextToken());
                K += Integer.parseInt(st.nextToken());
            }
            if(Y > K){
                System.out.println("Yonsei");
            }else if(Y < K){
                System.out.println("Korea");
            }else{
                System.out.println("Draw");
            }
        }
    }
}
