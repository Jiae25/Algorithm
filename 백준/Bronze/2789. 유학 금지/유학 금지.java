import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != 'C' && c != 'A' && c != 'M' && c != 'B' && c != 'R' && c != 'I' && c != 'D' && c != 'G' && c != 'E') {
                answer.append(c);
            }
        }
        System.out.println(answer.toString());
    }

}