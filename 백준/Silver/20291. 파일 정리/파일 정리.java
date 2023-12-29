import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 파일의 개수

        TreeMap<String, Integer> treeMap = new TreeMap<>(); // TreeMap은 키의 오름차순으로 정렬됨
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), "."); // .으로 구분
            st.nextToken();
            String extension = st.nextToken(); // 확장자
            treeMap.put(extension, treeMap.getOrDefault(extension, 0) + 1); // map에 확장자와 파일의 개수 저장 
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()){ // map 순서대로 출력
            sb.append(entry.getKey() + " " + entry.getValue() + "\n");
        }
        System.out.println(sb.delete(sb.length() - 1, sb.length()));
    }
}