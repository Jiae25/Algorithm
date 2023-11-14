import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wmap = new HashMap<>();
        for (int i = 0; i < want.length; i++){
            wmap.put(want[i], number[i]);
        }
        Map<String, Integer> dmap = new HashMap<>();
        for (int i = 0; i < 10; i++){
            if(dmap.containsKey(discount[i])){
                int cnt = dmap.get(discount[i]);
                dmap.put(discount[i], ++cnt);
            }else{
                dmap.put(discount[i], 1);
            }
        }
        answer = check(wmap, dmap) ? 1 : 0;


        for (int i = 10; i < discount.length; i++){
            // 존재 확인 있으면 +1 없으면 1
            if(dmap.containsKey(discount[i])){
                dmap.put(discount[i], dmap.get(discount[i]) + 1);
            }else{
                dmap.put(discount[i], 1);
            }
//            System.out.println(dmap.get(discount[0]));
            dmap.put(discount[i-10], dmap.get(discount[i-10]) - 1);
            if(check(wmap, dmap)){
                answer++;
            }
        }
        return answer;
    }

    private static boolean check(Map<String, Integer> wmap, Map<String, Integer> dmap) {
        for (String key : wmap.keySet()){
            if(!dmap.containsKey(key) || dmap.get(key) != wmap.get(key)){
                return false;
            }
        }
        return true;
    }
}