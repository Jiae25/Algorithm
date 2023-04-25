import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2480_주사위세개 {
    private static int a, b, c;
    private static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        if(a == b && a == c && b == c){
            answer = 10000 + (a * 1000);
        }else if(a == b || a == c){
            answer = 1000 + (a * 100);
        }else if(b == c){
            answer = 1000 + (b *  100);
        }else{
            answer = Math.max(a, Math.max(b, c)) * 100;
        }

        System.out.println(answer);
    }
}