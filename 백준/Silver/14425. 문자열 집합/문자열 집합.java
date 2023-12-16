import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 집합S에 포함된 문자열의 개수
        int M = Integer.parseInt(st.nextToken()); // 검사해야할 문자열의 개수
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++){ // set에 집합 문자열 추가
            set.add(br.readLine());
        }
        int answer = 0;
        for (int i = 0; i < M; i++){ // M이 set에 포함되어있는지 확인
            String input = br.readLine();
            if(set.contains(input)){
                answer++;
            }
        }
        System.out.println(answer);
    }
}