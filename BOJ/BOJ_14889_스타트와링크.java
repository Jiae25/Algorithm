package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * 조합
 * https://www.acmicpc.net/problem/14889
 */
public class BOJ_14889_스타트와링크 {
	private static int N;
	private static int[][] map;
	private static boolean[] selected;
	private static ArrayList<Integer> start;
	private static ArrayList<Integer> link;
	private static int skillDiff = 987654321;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		selected = new boolean[N];
		
		comb(0, 0); // 모일 사람수, 시작 idx
		System.out.println(skillDiff);
	} // end of main

	private static void comb(int cnt, int idx) {
		if(cnt == N/2) { // N명을 2팀으로 나눔
			calc(); // 선수 조합
			return;
		}
		for (int i = idx; i < N; i++) {
			selected[i] = true;
			comb(cnt+1, i+1);
			selected[i] = false;
		}
	}

	private static void calc() {
		start = new ArrayList<>();
		link = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			if(selected[i]) {
				start.add(i);
			}else {
				link.add(i);
			}
		}
		
		int startSkill = 0;
		int linkSkill = 0;
		
		for (int i = 0; i < start.size(); i++) {
			for (int j = 0; j < start.size(); j++) {
				if(i==j) continue;
				startSkill += map[start.get(i)][start.get(j)];
				linkSkill += map[link.get(i)][link.get(j)];
			}
		}
		skillDiff = Math.min(skillDiff, Math.abs(startSkill-linkSkill));
		
	}

} // end of class
