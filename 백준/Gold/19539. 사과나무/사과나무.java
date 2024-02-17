import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 사과나무 개수

        int sum = 0; // 나무높이 합
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            int height = Integer.parseInt(st.nextToken());
            sum += height;
            count += height / 2;
        }

        if(sum % 3 == 0 && count >= sum / 3){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        br.close();
    }
}