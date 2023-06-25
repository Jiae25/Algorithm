import java.io.IOException;
import java.util.*;

public class 주사위게임3 {
    public static void main(String[] args) throws IOException {
        int a = 2, b = 2, c = 1, d = 2;
        System.out.println(solution(a, b, c, d));
    }
    private static int solution(int a, int b, int c, int d) {
        int answer = 1;
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {a, b, c, d};
        int p = 0, q = 0;
        HashSet<Integer> check = new HashSet<>();
        for(int i = 0; i < 4; i++){
            if(set.contains(arr[i])){
                check.add(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
        switch (set.size()){
            case 1: // 1111
                answer = 1111 * a;
                break;
            case 2: // 1112 1122
                List<Integer> list = new ArrayList<>(set);
                System.out.println(list.toString());

                if (check.size() == 1) { // 1112
                    for (int data : check){
                        p = data;
                    }
                    set.removeAll(check);
                    for (int data : set){
                        q = data;
                    }
                    answer = (int)Math.pow(10 * p + q, 2);
                    break;
                }else{ // 1122
                    p = list.get(0);
                    q = list.get(1);
                    answer = (p + q) * Math.abs(p - q);
                    break;
                }
            case 3: // 1123
                set.removeAll(check);
                for (int data : set){
                    answer *= data;
                }
                break;
            case 4: // 1234
                Arrays.sort(arr);
                answer = arr[0];
        }
        return answer;
    }
}