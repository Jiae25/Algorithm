import java.io.IOException;

public class k의개수 {
    public static void main(String[] args) throws IOException {
        int i = 3;
        int j = 10;
        int k = 2;
        System.out.println(solution(i, j, k));
    }

    private static int solution(int start, int end, int k) {
        int answer = 0;
        String find = Integer.toString(k);
        for (int i = start; i <= end; i++){
            String s = Integer.toString(i);
            if(!s.contains(find)){
                continue;
            }
            for (int j = 0; j < s.length(); j++){
                if(s.charAt(j) == find.charAt(0)){
                    answer++;
                }
            }
        }
        return answer;
    }
}