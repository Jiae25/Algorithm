import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[] B = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        int result = minimizeS(A, B);
        System.out.println(result);
    }

    private static int minimizeS(int[] a, int[] b) {
        Arrays.sort(a); // a 오름차순
        Arrays.sort(b);
        for(int i = 0; i < b.length / 2; i++){ // b 내림차순 정렬. b의 처음과 끝을 서로 교환하여 역순으로 만듦
            int temp = b[i];
            b[i] = b[b.length - i - 1];
            b[b.length - i - 1] = temp;
        }

        int S = 0;
        for(int i = 0; i < a.length; i++){ // 가장 작은 수 * 가장 큰 수 = 최솟값
            S += a[i] * b[i];
        }

        return S;
    }
}