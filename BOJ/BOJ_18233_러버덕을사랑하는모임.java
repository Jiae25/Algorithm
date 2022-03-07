package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_18233_러버덕을사랑하는모임 {
	private static int N, P, E;
	private static int[][] member;
	private static boolean[] selected;
	private static int[] duck;
	private static ArrayList<Integer> member_idx;
	private static int min;
	private static int max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken()); // 다영 제외 인원
		P = Integer.parseInt(st.nextToken()); // 인형 나눠줄 인원
		E = Integer.parseInt(st.nextToken()); // 인형 합
		member = new int[N][2];
		selected = new boolean[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < 2; j++) {
				member[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		comb(0,0); // cnt, idx 인형 나눠줄 인원
		System.out.println(-1);
		
	}

	private static void comb(int cnt, int idx) {
		if(cnt == P) {
			calc(); // 인형 합 구하는 계산
			return;
		}
		for (int i = idx; i < N; i++) {
			selected[i] = true;
			comb(cnt+1, i+1);
			selected[i] = false;
		}
	}

	private static void calc() {
		member_idx = new ArrayList<>();
		min = 0;
		max = 0;
		for (int i = 0; i < N; i++) {
			if(selected[i]) { // 인형 나눠줄 사람이라면
				member_idx.add(i); // 몇번쨰 사람인지 확인
			}
		}
		for (int i = 0; i < member_idx.size(); i++) {
			// E
			min += member[member_idx.get(i)][0];
			max += member[member_idx.get(i)][1];
		}
		if(min <= E && E <= max) { // 일단 인형 나눠주긴 함
			// duck 배열에 나눠줄 case 넣기
			duckCounting();
		}
	}

	private static void duckCounting() {
		duck = new int[N]; // P명에게 나눠줄 인형 개수
		int surplus = E - min;
		for (int i = 0; i < P; i++) {
			duck[member_idx.get(i)] = member[member_idx.get(i)][0]; // 최소값으로 채움
			if(surplus == 0) {
				continue;
			}
			if(surplus <= member[member_idx.get(i)][1]-member[member_idx.get(i)][0]) {
				duck[member_idx.get(i)] += surplus;
				surplus = 0;
			}else {
				duck[member_idx.get(i)] += member[member_idx.get(i)][1]-member[member_idx.get(i)][0];
				surplus -= member[member_idx.get(i)][1]-member[member_idx.get(i)][0];
			}
		}
		for (int i : duck) {
			System.out.print(i + " ");
		}
		System.exit(0);
		
	}

}
