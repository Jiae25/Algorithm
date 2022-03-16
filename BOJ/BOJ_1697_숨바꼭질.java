package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 * 최단거리 : BFS
 * N = 수빈 위치
 * K = 동생 위치
 * 수빈위치 = X
 * 걷기 =  X+1 or X-1
 * 순간이동 = 2 * X
 * 수빈과 동생의 위치가 주어졌을 때, 수빈이가 동생을 찾을 수 있는 가장 빠른 시간 구하기 
 */
public class BOJ_1697_숨바꼭질 {
	private static int N;
	private static int K;
	private static int answer;
	private static boolean[] visited;
	private static int[] dc = {-1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken()); // 수빈 위치
		K = Integer.parseInt(st.nextToken()); // 동생 위치
		answer = 0; // 수빈 > 동생 : 빠른 시간
		visited = new boolean[100001];
		bfs();
		System.out.println(answer);
		
	} // end of main

	private static void bfs() {
		Queue<int[]> Q = new LinkedList<>();
		Q.add(new int[] {N, answer});
		visited[N] = true;
		
		while(!Q.isEmpty()) {
			int[] cur = Q.poll();
			int loc = cur[0]; // 수빈 위치
			int time = cur[1]; // 걸린 시간
			if(loc == K) {
				answer = time;
				return; // 수빈위치 = 동생위치
			} // 수빈 = 동생
			for (int i = 0; i < 2; i++) {
				int nc = loc + dc [i];
				if(nc<0 || nc > 100000) continue;
				if(!visited[nc]) {
					visited[nc] = true;
					Q.add(new int[] {nc, time+1});
				}
			} // 앞뒤로 이동
			int nc = loc * 2;
			if(nc > 100000) continue;
			if(!visited[nc]) {
				visited[nc] = true;
				Q.add(new int[] {nc, time+1});
			} // 2배 이동
		}
	}

} // end of class
