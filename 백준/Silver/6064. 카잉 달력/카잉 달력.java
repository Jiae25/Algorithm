import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int min = Math.min(x, y);
            int cnt = min;
            int temp = min; // 처음 시작위치
            while(x != y){ // x와 y가 같지 않을때만 확인
                if(x == min){ // x는 계산해도 변하지 않는 수. (x + N) % N
                    temp = (temp + M) % N; // temp는 y의 값 찾기
                    if(temp == 0) temp = N;
                    cnt += M;
                    if (temp == y) { // temp가 y 해에 도달한 경우
                        break;
                    }
                } else if (y == min) { // y는 계산해도 변하지 않는 수
                    temp = (temp + N) % M;
                    if(temp == 0) temp = M;
                    cnt += N;
                    if (temp == x) {
                        break;
                    }

                }
                if (temp == min) { // 초기값으로 돌아왔을 경우 표현X
                    cnt = -1;
                    break;
                }
            }
            System.out.println(cnt);
        }
    }
}