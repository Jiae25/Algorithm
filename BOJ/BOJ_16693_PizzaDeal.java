import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16693_PizzaDeal {
    public static void main(String[] args) throws IOException {
        // 면적 = A1, 가격 = P1 인 피자
        // 반지름 = R1, 가격 = P2 인 피자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A1 = Integer.parseInt(st.nextToken());
        int P1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        int R1 = Integer.parseInt(st.nextToken());
        int P2 = Integer.parseInt(st.nextToken());

        double pizza2 = R1 * R1 * Math.PI;
        if(A1 / (double)P1 < pizza2 / P2){
            System.out.println("Whole pizza");
        }else{
            System.out.println("Slice of pizza");
        }
    }
}
