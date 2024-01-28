import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력 받은 수열 저장
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 중복 제거를 위해 TreeSet 사용
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // 중복 제거 후 HashMap을 사용하여 좌표 압축
        HashMap<Integer, Integer> compressionMap = new HashMap<>();
        int index = 0;
        for (int num : sortedArr) {
            if (!compressionMap.containsKey(num)) {
                compressionMap.put(num, index++);
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(compressionMap.get(num)).append(" ");
        }

        System.out.println(sb.toString());
    }
}