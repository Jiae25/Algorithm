import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static String[] arr;
    private static boolean[] visited;
    private static int[] selected;
    private static long sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 주어진 수의 개수
        HashSet<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine()); // 확인할 수의 개수
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(st.nextToken());
            sb.append(set.contains(num) ? "1\n" : "0\n");
        }
        System.out.println(sb.delete(sb.length() - 1, sb.length()));
    }
}