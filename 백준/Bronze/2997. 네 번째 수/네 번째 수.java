import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int answer = 0;
        if(arr[1] - arr[0] == arr[2] - arr[1]){
            answer = arr[2] + arr[2] - arr[1];
        } else if (arr[1] - arr[0] < arr[2] - arr[1]) {
            answer = arr[1] + arr[1] - arr[0];
        } else{
            answer = arr[0] + arr[2] - arr[1];
        }
        System.out.println(answer);
    }
}