class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;
        int row = board.length;
        int col = board[0].length;

        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++){
            dp[i][0] = board[i][0];
            if(board[i][0] == 1) answer = 1;
        }
        for (int i = 0; i < col; i++){
            dp[0][i] = board[0][i];
            if(board[0][i] == 1) answer = 1;
        }

        for (int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(board[i][j] != 0){ // board 자신의 값이 1일 경우 사각형을 만들 수 있음
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1; // 현재 dp값의 위, 왼쪽대각선, 왼쪽. 이 세 값의 최소값 + 1이 현재위치의 값
                    answer = Math.max(answer, dp[i][j]); // 최대값
                }
            }
        }

        return answer * answer;
    }
}