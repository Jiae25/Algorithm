// 의상
import java.io.IOException;
import java.util.*;
public class 의상 {
    public static void main(String[] args) throws IOException {
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution(clothes));
    }

    private static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++){
            int x = map.containsKey(clothes[i][1]) ? map.get(clothes[i][1]) + 1 : 1;
            map.put(clothes[i][1], x);
        }
        int answer = 1;
        for (int v: map.values()){
            answer *= (v + 1);
        }

        return answer - 1;
    }
}