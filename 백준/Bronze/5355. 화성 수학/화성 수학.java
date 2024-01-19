import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double result = Double.parseDouble(st.nextToken());

            while (st.hasMoreTokens()) {
                String operator = st.nextToken();
                switch (operator){
                    case "@":
                        result *= 3;
                        break;
                    case "%":
                        result += 5;
                        break;
                    case "#":
                        result -= 7;
                        break;
                }
            }
            System.out.printf("%.2f\n", result);
        }
    }
}