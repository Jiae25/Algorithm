package BOJ;
/*
 * 220302 조합
 * https://www.acmicpc.net/problem/15650
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15650_N과M {
	private static int N;
	private static int M;
	private static boolean[] selected;
	private static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
		M = Integer.parseInt(st.nextToken());
		sb = new StringBuilder();
		selected = new boolean[N+1];
		comb(0, 1);
		System.out.println(sb);
	}

	private static void comb(int cnt, int start) { // 숫자 고른 개수 cnt, 시작하는 숫자 start
		if(cnt == M) { // M가만큼 선택이 되었으면
			for (int i = 1; i <= N; i++) {
				if(selected[i]) {
					sb.append(i).append(' ');
				}
			}
			sb.append("\n");
			return;
		}
		
		for (int i = start; i <= N; i++) {
			selected[i] = true;
			comb(cnt+1, i+1);
			selected[i] = false;
		}
	}
}
