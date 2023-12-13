import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Boolean> statusMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] entry = br.readLine().split(" ");
            String name = entry[0];
            String status = entry[1];

            if ("enter".equals(status)) {
                statusMap.put(name, true);
            } else {
                statusMap.put(name, false);
            }
        }

        // 현재 회사에 있는 사람들을 출력 (사전 역순)
        List<String> presentEmployees = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : statusMap.entrySet()) {
            if (entry.getValue()) {
                presentEmployees.add(entry.getKey());
            }
        }
        // 정렬
        Collections.sort(presentEmployees, Collections.reverseOrder());
        // 출력
        for (String employee : presentEmployees) {
            System.out.println(employee);
        }
    }
}