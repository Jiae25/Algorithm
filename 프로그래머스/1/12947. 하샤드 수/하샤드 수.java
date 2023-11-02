class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            sum += str.charAt(i) - '0';
        }
        answer = (x % sum == 0) ? true : false;
        return answer;
    }
}