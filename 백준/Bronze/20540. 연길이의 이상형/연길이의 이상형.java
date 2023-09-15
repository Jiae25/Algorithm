import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String originalString = "EISNTFJP";
        StringBuilder modifiedString = new StringBuilder();
        for (int i = 0; i < originalString.length(); i++) {
            char currentChar = originalString.charAt(i);

            // 제거할 문자를 포함하지 않으면 새로운 문자열에 추가
            if (input.indexOf(currentChar) == -1) {
                modifiedString.append(currentChar);
            }
        }
        String result = modifiedString.toString();
        System.out.println(result);
    }
}