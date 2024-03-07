import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * 조합
 * https://www.acmicpc.net/problem/15686
 */
public class Main {
	private static int N;
	private static int M;
	private static int[][] map;
	private static ArrayList<int[]> house;
	private static ArrayList<int[]> chicken;
	private static boolean[] selected;
	private static int ans = 987654321;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken()); // N x N 
		M = Integer.parseInt(st.nextToken()); // 치킨집의 최대 개수
		map = new int[N][N];
		house = new ArrayList<>();
		chicken = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1) {
					house.add(new int[] {i, j});
				}else if(map[i][j] == 2) {
					chicken.add(new int[] {i, j});
				}
			}
		}
		selected = new boolean[chicken.size()]; // 전체 치킨집 중 M개 조합
		comb(0, 0); // 선택된 치킨 집 수, chicken배열의 0번째 인덱스
		System.out.println(ans);
		
	} // end of main

	private static void comb(int cnt, int idx) {
		if(cnt == M) { // 치킨 집의 최대 개수로 선택됐을 때
			calc(); // 치킨 최단 거리 구하는 메소드
			return;
		}
		for (int i = idx; i < chicken.size(); i++) {
			selected[i] = true;
			comb(cnt+1, i+1);
			selected[i] = false;
		}
	}

	private static void calc() {
		int cityDis = 0;
		for (int i = 0; i < house.size(); i++) {
			int homeDis = 987654321;
			for (int j = 0; j < chicken.size(); j++) {
				if(!selected[j]) continue; // 선택되지 않은 치킨집
				homeDis = Math.min(homeDis, Math.abs(house.get(i)[0] - chicken.get(j)[0]) + Math.abs(house.get(i)[1] - chicken.get(j)[1])); // 최단거리 공식
			}
			cityDis += homeDis;
		}
		ans = Math.min(ans , cityDis);
	}
} // end of class