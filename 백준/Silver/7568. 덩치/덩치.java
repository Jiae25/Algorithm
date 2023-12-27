import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 전체 사람의 수

        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i][0] = x;
            arr[i][1] = y;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            int grade = 0;
            for (int j = 0; j < N; j++){
                if(i == j) {
                    continue;
                }
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    grade++;
                }
            }
            sb.append(grade + 1 + " ");
        }
        System.out.println(sb.toString());

    }
}