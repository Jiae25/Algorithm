import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어 {
    public static void main(String[] args) throws IOException {
        int[] arr = {1,1,3,3,0,1,1};

        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++){
            if (stack.isEmpty() || stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0 ; i--){ // Stack FILO
            answer[i] = stack.pop();
        }
        return answer;
    }
}

