import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16199_나이계산하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int sy = Integer.parseInt(st.nextToken());
        int sm = Integer.parseInt(st.nextToken());
        int sd = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        int ey = Integer.parseInt(st.nextToken());
        int em = Integer.parseInt(st.nextToken());
        int ed = Integer.parseInt(st.nextToken());
        if(sy == ey){
            System.out.println(0);
        }else if(sm > em){ // 생일 월이 지나지 않았을 떄
            System.out.println(ey - sy - 1);
        }else if(sm == em){ // 생일 월이 같을 때
            if(sd <= ed){ // 생일 날짜가 지났을때
                System.out.println(ey - sy);
            }else{
                System.out.println(ey - sy - 1);
            }
        }else{
            System.out.println(ey - sy);
        }
        System.out.println(ey - sy + 1); // 세는 나이
        System.out.println(ey - sy); // 연 나이
    }
}