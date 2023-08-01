import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 211016
 *
 */
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < TC; tc++) {
			String line = br.readLine();
			int score = 0;
			int cnt = 0;
			for (int i = 0; i < line.length(); i++) {
				if('O' == line.charAt(i)) { // 현재 위치가 O일때
					if(i>0 && 'O' == line.charAt(i-1)) cnt++; // 이전에 O였으면 점수 증가
					else cnt = 1; // 이전에 O가 아니면 점수는 1
					score += cnt; // 합산
				}else { // 현재 위치가 X일때
					cnt = 0;
				}
			}
			sb.append(score).append("\n");
		}
		System.out.println(sb);
	} // end of main
} // end of class
/*
5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX

*/