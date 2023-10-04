import java.util.*;

class Solution {
    private static boolean[] visited;
    private static HashSet<Integer> set;
    private static boolean[] prime;
    
    public int solution(String numbers) {
        int answer = 0;
        char[] numArr = numbers.toCharArray();
        visited = new boolean[numbers.length()];
        set = new HashSet<>();
        isPrime();
        permNum(numArr, "");
        for (int num : set){
            if(!prime[num]){
                answer++;
            }
        }
        return answer;
    }
    
    private static void isPrime() {
        prime = new boolean[10000004];
        prime[0] = prime[1] = true;
        for (int i = 2; i * i < prime.length; i++){
            if(!prime[i]){
                for (int j = i * 2; j < prime.length; j += i){
                    prime[j] = true;
                }
            }
        }
    }

    private static void permNum(char[] numArr, String cur) {
        if(!cur.equals("")){
            set.add(Integer.parseInt(cur));
        }
        for (int i = 0; i < numArr.length; i++){
            if (!visited[i]){
                visited[i] = true;
                permNum(numArr, cur + numArr[i]);
                visited[i] = false;
            }
        }
    }
}