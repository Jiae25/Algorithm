import java.io.*;
import java.util.*;

public class Main {
    private static int k;
    private static int[] S;
    private static int[] result;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            k = Integer.parseInt(st.nextToken()); // 주어진 숫자의 개수

            if(k == 0) {
                break; // 0일때 입력 종료
            }

            S = new int[k]; // 주어진 숫자 집합
            result = new int[6]; // 조합 결과를 저장할 배열

            for(int i = 0; i < k; i++){
                S[i] = Integer.parseInt(st.nextToken());
            }

            combination(0, 0);
            sb.append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }

    private static void combination(int depth, int start) {
        if(depth == 6){
            for(int num : result){
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i < k; i++){
            result[depth] = S[i];
            combination(depth + 1, i + 1);
        }
    }
}