import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : numlist){
            list.add(i);
        }
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                int subA = Math.abs(n - o1);
                int subB = Math.abs(n - o2);
                if(subA == subB) return o2 - o1;
                return subA - subB;
            }
        });
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}