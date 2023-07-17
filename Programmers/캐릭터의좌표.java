import java.io.IOException;
import java.util.Arrays;

public class 캐릭터의좌표 {
    public static void main(String[] args) throws IOException {
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};
        System.out.println(Arrays.toString(solution(keyinput, board)));
    }

    private static int[] solution(String[] keyinput, int[] board) {
        int curX = 0, curY = 0;
        for(int i = 0; i < keyinput.length; i++){
            switch (keyinput[i]){
                case "left" :
                    curX = Math.abs(curX - 1) > board[0] / 2 ? curX : curX - 1;
                    break;
                case "right" :
                    curX = Math.abs(curX + 1) > board[0] / 2 ? curX : curX + 1;
                    break;
                case "up" :
                    curY = Math.abs(curY + 1) > board[1] / 2 ? curY : curY + 1;
                    break;
                case "down" :
                    curY = Math.abs(curY - 1) > board[1] / 2 ? curY : curY - 1;
                    break;
            }
        }
        int[] answer = {curX, curY};
        return answer;
    }
}
