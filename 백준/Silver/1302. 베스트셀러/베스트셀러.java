import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 책의 개수

        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < N; i++){
            String bookTitle = br.readLine();
            map.put(bookTitle, map.getOrDefault(bookTitle, 0) + 1); // 책 제목과 팔린 개수를 map에 저장
            max = Math.max(max, map.get(bookTitle)); // 가장 많이 팔린 책의 수
        }

        ArrayList<String> bestSeller = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == max){ // 가장 많이 팔린 책을 list에 저장
                bestSeller.add(entry.getKey());
            }
        }
        Collections.sort(bestSeller); // 정렬
        System.out.println(bestSeller.get(0));
    }
}