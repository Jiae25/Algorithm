import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken()); // 포켓몬의 개수
        int M = Integer.parseInt(st.nextToken()); // 문제의 개수

        String[] arr = new String[N + 1];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= N; i++){
            String poketmon = br.readLine();
            arr[i] = poketmon;
            map.put(poketmon, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++){
            String input = br.readLine();
            if(map.containsKey(input)){ // 문자로 입력되었을때
                sb.append(map.get(input)).append("\n");
            }else{ // 숫자로 입력되었을때
                sb.append(arr[Integer.parseInt(input)]).append("\n");
            }
        }
        System.out.println(sb.delete(sb.length() - 1, sb.length()));
    }
}