class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] arr = new boolean[10];
        for (int i = 0; i < numbers.length; i++){
            arr[numbers[i]] = true;
        }
        for (int i = 0; i < arr.length; i++){
            if(!arr[i]){
                answer += i;
            }
        }
        return answer;
    }
}