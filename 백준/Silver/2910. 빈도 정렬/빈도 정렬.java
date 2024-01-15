import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 메시지의 길이 1 ≤ N ≤ 1,000
        int C = Integer.parseInt(st.nextToken()); // 숫자의 최대값 1 ≤ C ≤ 1,000,000,000

        int[] numbers = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>(); // 빈도수를 저장하는 Map
        Map<Integer, Integer> orderMap = new LinkedHashMap<>(); // 입력 순서를 저장하는 Map

        for(int i = 0; i < N; i++){
            int number = numbers[i];
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
            orderMap.putIfAbsent(number, i); // 맵에 키가 존재하지 않을때에만 값을 입력
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(frequencyMap.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                int freq1 = entry1.getValue();
                int freq2 = entry2.getValue();
                if (freq1 != freq2) {
                    return Integer.compare(freq2, freq1);
                } else {
                    return Integer.compare(orderMap.get(entry1.getKey()), orderMap.get(entry2.getKey()));
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : entries) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                sb.append(number).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}