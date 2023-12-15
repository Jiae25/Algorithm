import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 채팅방의 기록 수
        int answer = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++){
            String input = br.readLine();
            if(input.equals("ENTER")){
                answer += set.size();
                // 초기화
                set.clear();
            }else{
                set.add(input);
            }
        }
        answer += set.size();
        System.out.println(answer);

    }
}