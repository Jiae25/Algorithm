class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = 0;
        if(total % num == 0){
            start = (total / num) - (num / 2);
        }else{
            start = (total / num) - (total % num - 1);
        }
        for(int i = 0; i < num; i++){
            answer[i] = start++;
        }
        return answer;
    }
}