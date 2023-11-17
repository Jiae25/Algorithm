class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];
        int idx = 0;
        for (long i = left; i <= right; i++){
            long r = i / n;
            long c = i % n;
            answer[idx++] = (int) Math.max(r, c) + 1;
        }
        // System.out.println(Arrays.toString(answer));
        return answer;
    }
}