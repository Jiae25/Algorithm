import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			if(c == 32) cnt++;
		}
		if((int) s.charAt(0) == 32 && (int) s.charAt(s.length()-1) == 32) cnt--;
		else if((int) s.charAt(0) != 32 && (int) s.charAt(s.length()-1) != 32) cnt++;
		System.out.println(cnt);
		
	} // end of main
} // end of class