import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 210824
 */
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		String cal = Integer.toString(A * B * C);
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < cal.length(); j++) {
				if(cal.charAt(j)-'0' == i)
					count++;
			}
			System.out.println(count);
		}
	} // end of main
} // end of class

/*
150
266
427
*/