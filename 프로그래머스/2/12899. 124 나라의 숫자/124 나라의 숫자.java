class Solution {
    public String solution(int n) {
        String[] numbers = {"4", "1", "2"};
        String answer = "";
        while (n > 0) {
            int remainder = n % 3;
            n /= 3;
            if(remainder == 0) n--;
            answer = numbers[remainder] + answer;
        }
        return answer;
    }
}