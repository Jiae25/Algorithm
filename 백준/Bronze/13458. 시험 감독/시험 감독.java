import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 시험장 개수
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int B = Integer.parseInt(st.nextToken()); // 총감독관 감시 응시자 수
        int C = Integer.parseInt(st.nextToken()); // 부감독관 감시 응시자 수
        long answer = 0;
        for (int i = 0; i < N; i++){
            if(arr[i] > B){
                answer += 1 + (arr[i] - B) / C;
                if((arr[i] - B) % C != 0) answer += 1;
            }else{
                answer += 1;
            }

        }
        System.out.println(answer);
        br.close();
    }
}