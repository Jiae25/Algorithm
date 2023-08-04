import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int t = 0; t < N; t++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int eat = Integer.parseInt(st.nextToken());
            int need = Integer.parseInt(st.nextToken());
            if(eat >= need) System.out.println("MMM BRAINS");
            else System.out.println("NO BRAINS");
        }
    }
}