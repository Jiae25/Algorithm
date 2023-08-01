import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++){
            sb.append(str.indexOf(c)).append(" ");
        }
        System.out.println(sb.toString());
    }
}