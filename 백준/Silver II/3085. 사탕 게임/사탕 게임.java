import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static int N;
    private static char[][] board;
    private static int max = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        board = new char[N][N];
        for(int i = 0; i < N; i++){ // 보드 초기화
            board[i] = br.readLine().toCharArray();
        }

        // 가로
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N - 1; j++){
                // 가로 인접 확인
                if(board[i][j] == board[i][j+1]){
                    continue;
                }else{
                    swapCandy(i, j, 0);
                    checkMax(); // 길이체크
                    swapCandy(i, j, 0); // 원복
                }
            }
        }

        // 세로
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N - 1; j++){
                if(board[j][i] == board[j+1][i]){ // 세로 인접 확인
                    continue;
                }else{
                    swapCandy(j, i, 1);
                    checkMax(); // 길이체크
                    swapCandy(j, i, 1); // 원복
                }
            }
        }
        System.out.println(max);
    }

    private static void swapCandy(int x, int y, int dir) {
        if(dir == 0){ // 가로 swap
            char temp = board[x][y];
            board[x][y] = board[x][y+1];
            board[x][y+1] = temp;
        }else{ // 세로 swap
            char temp = board[x][y]; // j = x, i = y
            board[x][y] = board[x+1][y];
            board[x+1][y] = temp;
        }
    }

    private static int checkMax() {
        // 가로체크
        for(int i = 0; i < N; i++){
            int len = 1; // 다음줄 len 초기화
            for(int j = 0; j < N-1; j++){
                if(board[i][j] != board[i][j+1]){
                    len = 1; // 같은 줄에서 인접한 사탕 색이 다를 경우 len 초기화
                    continue;
                }
                len++;
                max = Math.max(max, len);
            }
        }

        // 세로체크
        for(int i = 0; i < N; i++){
            int len = 1;
            for(int j = 0; j < N-1; j++){
                if(board[j][i] != board[j+1][i]){
                    len = 1;
                    continue;
                }
                len++;
                max = Math.max(max, len);
            }
        }
        return max;
    }
}