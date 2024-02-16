import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 약수의 개수

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){ // 약수를 배열에 저장
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 배열 정렬

        if(n == 1){ // 약수의 개수가 1인 경우 약수의 제곱수
            System.out.println(arr[0] * arr[0]);
        }else{
            System.out.println(arr[0] * arr[n - 1]); // 가장 작은 수와 큰 수의 곱
        }
        
        br.close();
    }
}