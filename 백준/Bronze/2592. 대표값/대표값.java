import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine());
            sum += num;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxKey = 0;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxValue){
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        System.out.println(sum / 10);
        System.out.println(maxKey);
    }
}