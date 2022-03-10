package 프로그래머스;

class 타겟넘버_DFS {
    private static int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        
        dfs(numbers, target, 0, numbers[0]);
        dfs(numbers, target, 0, -numbers[0]);
        
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int idx, int sum){
        if(idx == numbers.length-1) {
            if(sum == target)
                answer++;
            return;
        }
        
        dfs(numbers, target, idx+1, sum+numbers[idx+1]);
        dfs(numbers, target, idx+1, sum-numbers[idx+1]);
    }
}