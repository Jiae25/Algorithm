import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            String answer = "no";
            if(arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]){
                answer = "yes";
            }
            System.out.printf("Scenario #%d:\n%s\n\n", i, answer);
        }
    }
}