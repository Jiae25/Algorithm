import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 학생의 수
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++){
            list.add(i);
        }
        for (int i = 0; i < N; i++){
            int pick = Integer.parseInt(st.nextToken());
            int temp = list.get(i);
            list.remove(i);
            list.add(i - pick, temp);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++){
            sb.append(list.get(i)).append(" ");
        }
        System.out.println(sb.delete(sb.length() - 1, sb.length()));
    }
}