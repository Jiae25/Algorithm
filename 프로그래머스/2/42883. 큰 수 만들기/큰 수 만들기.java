import java.util.*;

class Solution {
    public String solution(String number, int k) {
        int len = number.length() - k;
        ArrayList<Character> list = new ArrayList<>();
        for (char c : number.toCharArray()){
            while (!list.isEmpty() && list.get(list.size() - 1) < c && k > 0) {
                list.remove(list.size() - 1);
                k--;
            }
            list.add(c);
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < len; i++){
            answer.append(list.get(i));
        }
        return answer.toString();
    }
}