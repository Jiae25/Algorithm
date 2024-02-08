import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 학생 수
        int K = Integer.parseInt(st.nextToken()); // 한 방에 배정할 수 있는 최대 인원 수

        int[][] count = new int[2][7]; // 성별과 학년별 인원 수를 저장하는 배열
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken()); // 학생의 성별
            int Y = Integer.parseInt(st.nextToken()); // 학생의 학년
            count[S][Y]++;
        }
        int rooms = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j <= 6; j++) {
                rooms += (count[i][j] + K - 1) / K; // 방의 개수 계산
            }
        }
        System.out.println(rooms);
    }
}
