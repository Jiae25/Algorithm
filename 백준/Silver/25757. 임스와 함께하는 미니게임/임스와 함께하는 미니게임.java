import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        String game = st.nextToken();

        Set<String> playerName = new HashSet<>();
        for(int i = 0; i < N; i++){
            playerName.add(br.readLine());
        }

        int num = playerName.size();
        int answer = 0;
        switch (game){
            case "Y": // 윷놀이 2명
                answer = num;
                break;
            case "F": // 같은 그림 찾기 3명
                answer = num / 2;
                break;
            case "O": // 원카드 4명
                answer = num / 3;
                break;
        }

        System.out.println(answer);

    }
}
