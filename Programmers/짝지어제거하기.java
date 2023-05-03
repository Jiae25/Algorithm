// 짝지어 제거하기

import java.util.Stack;

public class 짝지어제거하기 {
    public static int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        if(stack.isEmpty()){
            answer = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "baabaa";
        System.out.println(solution(s));

    }
}