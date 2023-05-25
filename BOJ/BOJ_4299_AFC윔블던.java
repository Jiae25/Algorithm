import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4299_AFC윔블던 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int plus = Integer.parseInt(st.nextToken());
        int minus = Integer.parseInt(st.nextToken());
        int a = (minus + plus) / 2;
        int b = plus - a;

        if(plus < 0 || minus < 0 || plus < minus ) {
            System.out.println(-1);
        }else if((minus + plus) % 2 != 0 || (plus - minus) % 2 != 0){
            System.out.println(-1);
        }else{
            System.out.println(a + " " + b);
        }

    }
}