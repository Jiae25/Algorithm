import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class 주식가격 {
    public static void main(String[] args) throws IOException {
        int[] prices = {1,2,3,1,3};
        System.out.println(Arrays.toString(solution(prices)));
    }
    private static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.toString());
            int idx = stack.pop();
            answer[idx] = prices.length - idx - 1;
        }
        return answer;
    }
}