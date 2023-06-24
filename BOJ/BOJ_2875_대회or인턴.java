import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2875_대회or인턴 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int team = 0;
        if(N >= M * 2){
            team = M;
            N = N - M * 2;
        }else{
            team = N / 2;
            N = N % 2;
        }
        M = M - team;
//        System.out.println(team + " : " + N + " " + M + " " + K);
        while(N + M < K && team >= 0){
            team--;
            N += 2;
            M += 1;
        }
        System.out.println(team);
    }
}