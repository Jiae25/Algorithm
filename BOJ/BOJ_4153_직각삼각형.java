import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_4153_직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int[] arr = new int[3];
            int bk_cnt = 0;
            for (int i = 0; i < 3; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                bk_cnt = (arr[i] == 0) ? ++bk_cnt : 0;
            }
            Arrays.sort(arr);
            if(bk_cnt == 3) break;
            if((arr[2] * arr[2]) == (arr[0] * arr[0]) + (arr[1] * arr[1])){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
}
