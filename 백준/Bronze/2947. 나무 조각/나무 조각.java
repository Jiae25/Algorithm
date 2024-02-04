import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] correct = {1, 2, 3, 4, 5};
        int idx = 0;
        int[] change = Arrays.copyOf(arr, arr.length);
        while (!Arrays.equals(arr, correct)) {
            if (arr[idx] > arr[idx + 1]) {
                int temp = arr[idx];
                arr[idx] = arr[idx + 1];
                arr[idx + 1] = temp;
            }
            idx++;
            if (idx == arr.length - 1) idx = 0;

            if (!Arrays.equals(arr, change)) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            change = Arrays.copyOf(arr, arr.length);
        }

        br.close();
    }
}
