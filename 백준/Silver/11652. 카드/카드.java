import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 숫자카드의 개수

        HashMap<Long, Integer> map = new HashMap<>(); // <숫자카드, 개수>
        int max = 0; // 많이 가지고 있는 카드 개수
        for(int i = 0; i < N; i++){
            long cardNum = Long.parseLong(br.readLine());
            map.put(cardNum, map.getOrDefault(cardNum, 0) + 1); // map에 카드의 수과 개수를 저장
        }

        long result = 0;
        int maxCnt = 0;
        for (Map.Entry<Long, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCnt || (entry.getValue() == maxCnt && entry.getKey() < result)){ // 최빈값 찾기. 최빈값이 같을 경우 작은 숫자를 선택
                maxCnt = entry.getValue();
                result = entry.getKey();
            }
        }

        System.out.println(result);
    }
}