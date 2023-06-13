import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3009_네번째점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrX = new int[3];
        int[] arrY = new int[3];
        for (int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
        }
        int ansX = arrX[0], ansY = arrY[0];
        if(ansX == arrX[1]){
            ansX = arrX[2];
        }else if(ansX == arrX[2]){
            ansX = arrX[1];
        }
        if(ansY == arrY[1]){
            ansY = arrY[2];
        }else if(ansY == arrY[2]){
            ansY = arrY[1];
        }
        System.out.println(ansX + " " + ansY);
    }
}
