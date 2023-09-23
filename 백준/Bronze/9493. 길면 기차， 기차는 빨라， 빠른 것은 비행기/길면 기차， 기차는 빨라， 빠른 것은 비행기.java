import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int M = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (M == 0 && A == 0 && B == 0) {
                break;
            }
            int timeDiff = calTimeDiff(M, A, B);
            // 시간을 시, 분, 초로 변환하여 출력
            int hours = timeDiff / 3600;
            int minutes = (timeDiff % 3600) / 60;
            int seconds = timeDiff % 60;
            sb.append(String.format("%d:%02d:%02d\n", hours, minutes, seconds));
        }
        System.out.print(sb);
        br.close();
    }

    public static int calTimeDiff(int M, int A, int B) {
        // 기차와 비행기의 이동 시간 차이 계산
        double trainTime = (double) M / A; // 기차 이동 시간 (시간)
        double planeTime = (double) M / B; // 비행기 이동 시간 (시간)

        // 시간 차이를 초로 변환하여 반환
        return (int) Math.round(Math.abs(trainTime - planeTime) * 3600);
    }
}