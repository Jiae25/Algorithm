import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int n;
    private static int k;
    private static int[] cards;
    private static int[] selected;
    private static boolean[] visited;
    private static HashSet<String> resultSet;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); // 카드의 개수
        k = Integer.parseInt(br.readLine()); // 선택할 카드의 수

        cards = new int[n];         // 입력받은 숫자 카드 배열
        selected = new int[k];      // 선택된 숫자를 담을 배열
        visited = new boolean[n];   // 방문 여부를 체크하는 배열
        resultSet = new HashSet<>();// 중복을 방지하기 위한 Set

        for (int i = 0; i < n; i++){ // 숫자 카드 입력 받기
            cards[i] = Integer.parseInt(br.readLine());
        }

        permutation(0); // 순열을 이요하여 숫자 선택
        System.out.println(resultSet.size());
    }

    private static void permutation(int depth) {
        if(depth == k){ // 숫자를 k개 선택했을 때
            StringBuilder result = new StringBuilder();
            for (int i : selected){
                result.append(i);
            }
            resultSet.add(result.toString());
            return;
        }
        
        for (int i = 0; i < n; i++){ // 숫자 카드 중 선택되지 않은 숫자를 선택
            if(!visited[i]){
                visited[i] = true;  // 숫자 선택을 표시
                selected[depth] = cards[i]; // 선택된 숫자 저장
                permutation(depth + 1); // 다음 숫자 선택으로 재귀
                visited[i] = false; // 선택 취소
            }
        }
    }

}