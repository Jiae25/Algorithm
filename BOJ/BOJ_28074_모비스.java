import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_28074_모비스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = {'M','O','B','I','S'};
        for (int i = 0; i < arr.length; i++){
            if(!s.contains(String.valueOf(arr[i]))){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
