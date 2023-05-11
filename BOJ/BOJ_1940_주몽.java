import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1940_주몽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 재료의 개수
        int M = Integer.parseInt(br.readLine()); // 갑옷을 만드는데 필요한 수
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        // 1 2 3 4 5 7
        int left = 0;
        int right = N - 1;
        int cnt = 0; // 갑옷을 만들 수 있는 개수
        while(left < right){
            int sum = arr[left] + arr[right];
            if (sum == M) {
                cnt++;
                left++;
                right--;
            }else if(sum < M){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(cnt);
    }
}