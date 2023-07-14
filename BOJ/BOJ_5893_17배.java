import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_5893_17배 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binaryInput = br.readLine();
        BigInteger binary = new BigInteger(binaryInput, 2);
        BigInteger multi = new BigInteger("17");
        BigInteger result = binary.multiply(multi);
        String binaryResult = binary.multiply(multi).toString(2);
        System.out.println(binaryResult);
    }
}