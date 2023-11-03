class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        while(n != 1){
            // 500번 이상 반복해도 1이 되지 않으면 -1 반환
            if(answer >= 500){
                return -1;
            }

            if(n%2 == 0){ // 입력된 수가 짝수라면 2로 나눔
                n /= 2;
            }else{ // 홀수인 경우
                n = (n * 3) + 1;
            }
            answer++;
        }
        return answer;
    }
}