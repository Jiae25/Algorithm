import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2444_별찍기7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i <= (N * 2 - 1) / 2; i++){
            for (int j = i; j < (2 * N - 1) / 2; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2 + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = (N * 2 - 1) / 2; i > 0; i--){
            for (int j = i; j <= (N * 2 - 1) / 2; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2 - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
