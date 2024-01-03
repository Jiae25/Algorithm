import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static String[] arr;
    private static boolean[] visited;
    private static int[] selected;
    private static long sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++){
            arr = br.readLine().split(" ");
            sum = 0;
            visited = new boolean[arr.length];
            selected = new int[2]; // 선택된 수를 담을 배열
            combination(0, 1); // idx, start 1부터 시작. arr[0]은 크기를 넣은 값. idx = 1부터 숫자
            System.out.println(sum);
        }
    }

    private static void combination(int idx, int start) {
        if(idx == selected.length){
            sum += gcd(selected[0], selected[1]);
            return;
        }
        for(int i = start; i < arr.length; i++){
            selected[idx] = Integer.parseInt(arr[i]);
            combination(idx + 1, i + 1);
        }
    }

    private static int gcd(int a, int b) { // 최대공약수
        if(a % b == 0){
            return b;
        }
        return gcd(b, a % b);
    }
}