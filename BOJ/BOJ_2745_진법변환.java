import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
BOJ_2745_진법 변환
B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력
 */
public class BOJ_2745_진법변환 {
    private static String N;
    private static int B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = st.nextToken(); // 수
        B = Integer.parseInt(st.nextToken()); // 진법
        int decimal = 0;
        int power = 0;
        for (int i = N.length()-1; i >= 0; i--){ // 문자열을 뒤부터 순회
            int digit = Character.getNumericValue(N.charAt(i));
            decimal += digit * Math.pow(B, power);
            power++;
        }
        System.out.println(decimal);
    }
    
}