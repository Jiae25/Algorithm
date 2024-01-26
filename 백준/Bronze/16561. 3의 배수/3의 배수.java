import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int target = Integer.parseInt(br.readLine()) / 3;
    int result = 0;
    for (int i = 1; i <= target; i++) {
      for (int j = 1; j <= target - i; j++) {
        if (target - i - j > 0) {
          result += 1;
        }
      }
    }
    System.out.println(result);
  }
}