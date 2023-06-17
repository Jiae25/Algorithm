import java.io.*;
import java.util.*;

public class BOJ_18110_solvedac {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int cnt = (int) Math.round(n * 15.0 / 100);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = cnt; i < n - cnt; i++){
            sum += arr[i];
        }
        System.out.println(Math.round(sum / (n - cnt * 2.0)));
    }
}