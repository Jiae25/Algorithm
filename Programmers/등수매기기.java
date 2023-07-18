import java.io.IOException;
import java.util.*;

public class 등수매기기 {
    public static void main(String[] args) throws IOException {
        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
//        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        solution(score);
    }

    private static int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++){
            System.out.println(scoreList.indexOf(score[i][0] + score[i][1]));
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1; // 리스트에서 일치하는 첫 번째 요소를 찾으면 해당 요소의 인덱스를 반환
        }
        return answer;
    }
}
