import java.util.*;
class Solution {
    public int[] solution(int n, long k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            list.add(i);
        }

        long[] factorial = new long[n];
        factorial[0] = 1;
        for (int i = 1; i < n; i++){
            factorial[i] = factorial[i - 1] * i;
        }

        int[] answer = new int[n];
        int idx = 0;
        for (int i = n; i > 0; i--){
            long num = (k - 1) / factorial[i - 1];
            answer[idx++] = list.get((int) num);
            list.remove((int) num);
            k %= factorial[i - 1];
            if (k == 0) {
                k = (int) factorial[i - 1];
            }
        }
        return answer;
    }
}