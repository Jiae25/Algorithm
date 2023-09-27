import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long sum = 0;
        if (A > B) {
            long temp = A;
            A = B;
            B = temp;
        }
        // 등차수열의 합 공식
        sum = (B - A + 1) * (A + B) / 2;
        System.out.println(sum);
    }

}