import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

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

        nextPermutation(); // 다음 순열
    }

    private static void nextPermutation() {
        // 1. 순열의 뒤부터 탐색하여 증가하는 구간을 찾는다.
        int idx = N - 1;
        while(idx > 0 && arr[idx - 1] > arr[idx]){
            idx--;
        }

        // 2. 만약, 증가하는 부분이 존재하지 않는다면 다음 순열은 존재하지 않는다.
        if(idx == 0){
            System.out.println(-1);
            return;
        }

        // 3. 증가하는 구간과 구분되는 지점으로 좌우로 나눈다.
        // 4. 좌측의 가장 우측 숫자, 우측의 가장 우측 지점부터 탐색하여 큰 수를 찾는다.
        int bigIdx = N - 1;
        while(bigIdx > idx && arr[idx - 1] > arr[bigIdx]){
            bigIdx--;
        }

        // 5. 해당 숫자를 찾았다면 각 숫자를 swap 한다.
        int temp = arr[idx - 1];
        arr[idx - 1] = arr[bigIdx];
        arr[bigIdx] = temp;

        // 6. 우측 지점을 정렬한다.
        Arrays.sort(arr, idx, N);

        // 결과 출력
        for(int num : arr){
            sb.append(num + " ");
        }
        System.out.println(sb.toString());
    }
}