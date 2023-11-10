class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int width = 0;
        int height = 0;
        for (int i = 1; i <= sum; i++){
            if(sum % i == 0){
                int j = sum / i;
                if(i >= j && ((i - 2) * (j - 2) == yellow)){
                    width = i;
                    height = j;
                }
            }
        }
        int[] answer = {width, height};
        return answer;
    }
}