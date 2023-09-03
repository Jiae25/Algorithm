import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] wArr = new int[10];
        int[] kArr = new int[10];
        int wSum = 0, kSum = 0;
        for (int i = 0; i < 20; i++){
            if (i < 10) {
                wArr[i] = Integer.parseInt(br.readLine());
            }else{
                kArr[i - 10] = Integer.parseInt(br.readLine());
            }
        }
        Arrays.sort(wArr);
        Arrays.sort(kArr);
        for (int i = 7; i < 10; i++){
            wSum += wArr[i];
            kSum += kArr[i];
        }
        System.out.println(wSum + " " + kSum);
    }
}