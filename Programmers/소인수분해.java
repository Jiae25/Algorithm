import java.io.IOException;
import java.util.*;

public class 소인수분해 {
    public static void main(String[] args) throws IOException {
        int n = 10000;
        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(int n) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++){
            while(n % i == 0){
                n /= i;
                set.add(i);
            }
        }
        answer = set.stream().mapToInt(x->x).toArray();
        Arrays.sort(answer);
        return answer;
    }
}