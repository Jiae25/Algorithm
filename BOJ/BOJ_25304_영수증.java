import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25304_영수증 {
    private static int a, b;
    private static int total;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine()); // 총 금액
        int N = Integer.parseInt(br.readLine()); // 구매한 물건 종류의 수
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(st.nextToken()); // 물건 가격
            b = Integer.parseInt(st.nextToken()); // 개수
            total += a * b;
        }

        if(total == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
