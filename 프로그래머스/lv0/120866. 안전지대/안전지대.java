class Solution {
    private static int n;
    private static int [] dr = {-1, -1, -1, 0, 1, 1, 1, 0};
    private static int [] dc = {-1, 0, 1, 1, 1, 0, -1, -1};
    public int solution(int[][] board) {
        int answer = 0;
        n = board.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 0 && !bombCheck(i, j, board)){
                    answer++;
                }
            }
        }
        return answer;
    }
    private boolean bombCheck(int i, int j, int[][] board){        
        for(int d = 0; d < 8; d++){
            int nr = i + dr[d];
            int nc = j + dc[d];
            if(nr < 0 || nr >= n || nc < 0 || nc >= n){
                continue;
            }
            if(board[nr][nc] == 1) {
                return true;
            }
        }
        return false;
    }
}