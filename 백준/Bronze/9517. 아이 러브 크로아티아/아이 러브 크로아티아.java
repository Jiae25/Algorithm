import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()); // 처음 폭탄을 들고 있는 사람
        int n = Integer.parseInt(br.readLine()); // 질문의 개수
        int time = 0; // 게임시간 3분 30초
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int t = Integer.parseInt(st.nextToken()); // 질문 대답까지 걸린 시간
            char z = st.nextToken().charAt(0); // 대답 진실여부(T, N, P)
            time += t;
            if(time > 210) break;
            if(z == 'T') k++; // 다음 폭탄을 들고 있는 사람
            if(k == 9) k = 1;
        }
        System.out.println(k);
        br.close();
    }
}