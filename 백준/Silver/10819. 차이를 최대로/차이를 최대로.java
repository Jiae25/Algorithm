import java.io.*;
import java.util.*;

public class Main {
    private static int[] arr;
    private static int[] selected;
    private static boolean[] visited;
    private static int max;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        selected = new int[N];
        visited = new boolean[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        max = calculate(arr); // 현재 주어진 배열의 계산 값

        permute(0); // 전체 순열 계산

        System.out.println(max);
    }

    private static void permute(int depth){
        if(depth == selected.length){
            max = Math.max(max, calculate(selected)); // 선택된 순열을 계산
            return;
        }
        for(int i = 0; i < arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                selected[depth] = arr[i];
                permute(depth + 1);
                visited[i] = false;
            }
        }
    }

    private static int calculate(int[] sumArr){
        int sum = 0;
        for(int i = 0; i < sumArr.length - 1; i++){
            sum += Math.abs(sumArr[i] - sumArr[i + 1]);
        }
        return sum;
    }
}