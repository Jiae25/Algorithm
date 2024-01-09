import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 9;
        int totalSum = 0;

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            int height = Integer.parseInt(br.readLine());
            arr[i] = height;
            totalSum += height;
        }

        Arrays.sort(arr);
        int fake1 = 0, fake2 = 0;
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                if(totalSum - arr[i] - arr[j] == 100){
                    fake1 = arr[i];
                    fake2 = arr[j];
                }
            }
        }

        for(int i = 0; i < N; i++){
            if(fake1 == arr[i] || fake2 == arr[i]) continue;
            System.out.println(arr[i]);
        }

    }
}