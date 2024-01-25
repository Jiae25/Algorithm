import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>(); // 동명이인 존재 가능
        for(int i = 0; i < N; i++){ // map에 참가자 추가
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for(int i = 0; i < N - 1; i++){ // 완주한 사람 -1
            String name = br.readLine();
            map.replace(name, map.get(name) - 1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){ // map에 1로 남아있는 사람 == 완주하지 못한 사람
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}