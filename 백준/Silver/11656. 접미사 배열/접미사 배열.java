import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int sLength = S.length();

        String[] arr = new String[sLength];
        for(int i = 0; i < sLength; i++){
            arr[i] = S.substring(i, sLength);
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(s + "\n");
        }
        System.out.println(sb.delete(sb.length() - 1, sb.length()));
        br.close();
    }
}