class Solution {
    public int solution(int storey) {
        int answer = 0;
        while(storey > 0){
            int num = storey % 10;
            storey /= 10;
            if(num > 5){ // 5 초과 시 더하기
                answer += (10 - num);
                storey++;
            }else if(num < 5){ // 5 미만 시 빼기
                answer += num;
            }else if(storey % 10 >= 5) { // 5인 경우 앞자리 숫자에 따라서 변경
                    answer += (10 - num);
                    storey++;
            }else{
                answer += num;
            }
        }
        return answer;
    }
}