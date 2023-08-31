import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hex = br.readLine();
        int decimal = Integer.parseInt(hex, 16);
        System.out.println(decimal);
        br.close();
    }
}
