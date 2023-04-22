import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_11382 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        BigInteger ans = BigInteger.ZERO;
        for (int i = 0; i < 3; i++){
            ans = ans.add(new BigInteger(st.nextToken()));
        }
        System.out.println(ans);
    }

}