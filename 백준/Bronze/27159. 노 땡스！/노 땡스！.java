import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] arr = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(s[i]);
        sum += arr[0];
        for (int i = 1; i < N; i++) {
            if (arr[i-1] != arr[i]-1)
                sum += arr[i];  // 이웃한 수가 1차이 나지 않는 경우 합하기
        }
        System.out.println(sum);
    }
}