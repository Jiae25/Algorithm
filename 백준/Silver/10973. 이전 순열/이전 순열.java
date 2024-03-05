import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

import static java.util.Comparator.reverseOrder;

public class Main {
    private static int N;
    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N]; // 입력받은 수를 저장할 배열
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if(prevPermutation()){ // 이전 순열
            for(int num : arr){
                sb.append(num + " ");
            }
            System.out.println(sb.toString());
        }else{
            System.out.println(-1);
        }

        br.close();
    }

    private static boolean prevPermutation() {
        // 주어진 순열의 우측부터 탐색하여 감소하는 부분을 찾는다.
        int idx = N - 1;
        while(idx > 0 && arr[idx - 1] < arr[idx]){
            idx--;
        }

        if(idx == 0){ // 감수하는 부분이 없는 경우 이전 순열은 없다.
            return false;
        }

        // 해당 인덱스를 기준으로 좌/우로 나누고,
        // 감소한 부분의 왼쪽에서 큰 값 찾기
        int bigIdx = N - 1;
        while(arr[idx - 1] < arr[bigIdx]){
            bigIdx--;
        }

        // 두 값 교환
        int temp = arr[idx - 1];
        arr[idx - 1] = arr[bigIdx];
        arr[bigIdx] = temp;

        // 교환한 부분부터 순열 뒤집기
        bigIdx = N - 1;
        while(idx < bigIdx){
            temp = arr[idx];
            arr[idx] = arr[bigIdx];
            arr[bigIdx] = temp;
            idx++;
            bigIdx--;
        }

        return true;
    }


}