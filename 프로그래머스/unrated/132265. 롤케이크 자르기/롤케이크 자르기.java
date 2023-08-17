import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashSet<Integer> left = new HashSet<>();
        HashMap<Integer, Integer> right = new HashMap<>();
        left.add(topping[0]);
        for (int i = 1; i < topping.length; i++){
            right.put(topping[i], right.getOrDefault(topping[i], 0) + 1);
        }
        for (int i = 1; i < topping.length; i++){
            if(left.size() == right.size()) answer++;
            left.add(topping[i]);
            right.put(topping[i], right.get(topping[i]) - 1);
            if(right.get(topping[i]) == 0){
                right.remove(topping[i]);
            }
            // System.out.println(left +" "+ right);
        }
        return answer;
    }
}