import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        List<String> result = new LinkedList<>();
        for (int i = 0; i < N; i++){
            set.add(br.readLine());
        }

        for (int i = 0; i < M; i++){
            String str = br.readLine();
            if(set.contains(str)){
                result.add(str);
            }
        }
        Collections.sort(result);
        StringBuilder sb = new StringBuilder();
        for (String str : result){
            sb.append(str).append("\n");
        }
        System.out.println(result.size());
        if(sb.length() > 0){
            System.out.println(sb.delete(sb.length() - 1, sb.length()));
        }
    }
}