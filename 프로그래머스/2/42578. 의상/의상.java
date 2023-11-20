import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++){
            int x = map.containsKey(clothes[i][1]) ? map.get(clothes[i][1]) + 1 : 1;
            map.put(clothes[i][1], x);
        }
        int answer = 1;
        for (int v: map.values()){
            answer *= (v + 1);
        }

        return answer - 1;
    }
}