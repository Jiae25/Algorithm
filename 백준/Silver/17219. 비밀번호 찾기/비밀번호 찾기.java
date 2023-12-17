import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 저장된 사이트 주소 개수
        int M = Integer.parseInt(st.nextToken()); // 비밀번호를 찾으려는 사이트 수
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String site = st.nextToken();
            String pw = st.nextToken();
            map.put(site, pw);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++){
            String findSite = br.readLine();
            sb.append(map.get(findSite)).append("\n");
        }
        System.out.println(sb.delete(sb.length() - 1, sb.length()));
    }
}