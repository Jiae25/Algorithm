import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_1247_부호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int tc = 0; tc < 3; tc++){
            int N = Integer.parseInt(br.readLine());
            BigInteger sum = new BigInteger("0");
            for (int i = 0; i < N; i++){
                BigInteger num = new BigInteger(br.readLine());
                sum = sum.add(num);
            }
            int result = sum.compareTo(BigInteger.ZERO);
            if(result == 0){
                System.out.println(0);
            }else if(result > 0){
                System.out.println("+");
            }else{
                System.out.println("-");
            }
        }
    }
}