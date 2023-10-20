import java.util.Stack;
class Solution {
    public String solution(String number, int k) {
        int len = number.length();
        int remain = len - k;
        Stack<Character> stack = new Stack<>();
        
        for (char digit : number.toCharArray()) {
            while (!stack.isEmpty() && stack.peek() < digit && k > 0) {
                stack.pop(); 
                k--;
            }
            stack.push(digit);
        }
        
        StringBuilder answer = new StringBuilder();
        while (!stack.isEmpty()) {
            answer.insert(0, stack.pop());
        }
        
        return answer.substring(0, remain);
    }
}