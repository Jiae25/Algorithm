import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input =br.readLine()) != null){
            int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(Math.max(arr[1] - arr[0], arr[2] - arr[1]) - 1);
        }
        br.close();
    }
}