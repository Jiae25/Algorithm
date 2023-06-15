import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2446_별찍기9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (2 * N - 1) / 2; i++){
            for (int k = 0; k < i; k++){
                sb.append(" ");
            }
            for (int j = 0; j < 2 * N - (i * 2 + 1); j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = 0; i <= (2 * N - 1) / 2; i++){
            for (int k = i; k < (2 * N - 1) / 2; k++){
                sb.append(" ");
            }
            for (int j = 0; j < (i * 2 + 1); j++){
                sb.append("*");
            }
            sb.append("\n");
        }

//        for (int i = 0; i <= 2 * N - 1; i++){
//            if((2 * N) - (2 * i) - 1 == -1){
//                continue;
//            }
//            if(i <= (2 * N - 1) / 2){
//                for (int j = 0; j < i; j++){
//                    sb.append(" ");
//                }
//            }else{
//                for (int j = 0; j < N * 2 - i - 1; j++){
//                    sb.append(" ");
//                }
//            }
//            for (int k = 0; k < Math.abs((2 * N) - (2 * i) - 1); k++){
//                sb.append("*");
//            }
//            sb.append("\n");
//        }
        System.out.println(sb.toString());
    }
}
