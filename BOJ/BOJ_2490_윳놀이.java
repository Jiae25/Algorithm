import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2490_윳놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int sum = 0;
            for (int j = 0; j < 4; j++){
                sum += Integer.parseInt(st.nextToken());
            }
            String result = "";
            if(sum == 0) result = "D";
            else if(sum == 1) result = "C";
            else if(sum == 2) result = "B";
            else if(sum == 3) result = "A";
            else if(sum == 4) result = "E";

            System.out.println(result);
        }
    }
}
