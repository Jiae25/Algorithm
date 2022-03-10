package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2636_치즈 {
	private static int N;
	private static int M;
	private static int[][] map;
	private static boolean[][] visited;
	private static int[] dr = { 0, 0, 1,-1 };
	private static int[] dc = { 1,-1, 0, 0 };
	private static ArrayList<int[]> cheese ;
	private static int cheeseCnt;
	private static int time;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken()); // 가
		M = Integer.parseInt(st.nextToken()); // 세
		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1) cheeseCnt++;
			}
		}
		while(cheeseCnt > 0) {
			cheese = new ArrayList<>();
			time++;
			visited = new boolean[N][M];
			bfs();
			for (int i = 0; i < cheese.size(); i++) {
				map[cheese.get(i)[0]][cheese.get(i)[1]] = 0;
				cheeseCnt--;
			}
		}
		System.out.printf(time + "\n" + cheese.size());
		
	} // end of main

	private static void bfs() {
		Queue<int[]> Q = new LinkedList<>();
		Q.add(new int[] {0,0});
		visited[0][0] = true;
		while(!Q.isEmpty()) {
			int[] cur = Q.poll();
			int r = cur[0];
			int c = cur[1];
			for (int i = 0; i < 4; i++) {
				int nr = r + dr[i];
				int nc = c + dc[i];
				if(nr<0 || nr>=N || nc<0 || nc>=M) continue;
				if(!visited[nr][nc] && map[nr][nc] == 0) { // 0일때를 큐에 다 넣어
					visited[nr][nc] = true;
					Q.add(new int[] {nr, nc});
				}else if(!visited[nr][nc] && map[nr][nc] == 1) {
					visited[nr][nc] = true;
					cheese.add(new int[] {nr,nc});
				}
			}
		}
	}
} // end of class
