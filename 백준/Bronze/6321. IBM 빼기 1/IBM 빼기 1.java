import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            String convertedName = convertName(name);
            System.out.println("String #" + i);
            System.out.println(convertedName);
            System.out.println();
        }
    }
    public static String convertName(String name) {
        StringBuilder result = new StringBuilder();

        for (char ch : name.toCharArray()) {
            char nextCh = (ch == 'Z') ? 'A' : (char) (ch + 1);
            result.append(nextCh);
        }

        return result.toString();
    }
}