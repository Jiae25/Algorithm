import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] numStr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            numStr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(numStr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String case1 = o1 + o2;
                String case2 = o2 + o1;
                return case2.compareTo(case1);
            }
        });
        StringBuilder answer = new StringBuilder();
        for(String str : numStr){
            answer.append(str);
        }
        if(answer.charAt(0) == '0') {
            return "0";
        }
        return answer.toString();
    }
}