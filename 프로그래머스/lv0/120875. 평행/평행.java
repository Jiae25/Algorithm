class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double AB = (double)(dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]);
        double CD = (double)(dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]);
        double AC = (double)(dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]);
        double BD = (double)(dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);
        double AD = (double)(dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]);
        double BC = (double)(dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]);
        if(AB == CD || AC == BD || AD == BC) answer = 1;
        return answer;
    }
}