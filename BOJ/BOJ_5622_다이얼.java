import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5622_다이얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            int num = (s.charAt(i) - 65) / 3;
            if(num == 6 && (s.charAt(i) - 65) % 3 == 0) num--;
            else if(num == 7 && (s.charAt(i) - 65) % 3 == 0) num--;
            else if(num >= 8) num--;
            sum += num + 3;
        }
        System.out.println(sum);
    }
}
