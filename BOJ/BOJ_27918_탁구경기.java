import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_27918_탁구경기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dScore = 0;
        int pScore = 0;
        for (int i = 0; i < N; i++){
            String s = br.readLine();
            if(s.equals("D")){
                dScore++;
            }else{
                pScore++;
            }
            if(Math.abs(dScore - pScore) >= 2){
                break;
            }
        }
        System.out.println(dScore + ":" + pScore);
    }
}
