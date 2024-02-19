import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 이동하려는 채널
        int M = Integer.parseInt(br.readLine()); // 고장난 버튼의 개수

        boolean[] isBroken = new boolean[10]; // 고장난 버튼 표시
        if(M > 0){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < M; i++){
                int brokenBtn = Integer.parseInt(st.nextToken());
                isBroken[brokenBtn] = true; // 고장
            }
        }

        int result = Math.abs(N - 100); // 숫자버튼을 사용하지 않고 +, -로만 이동하는 횟수

        for(int i = 0; i <= 1000000; i++){ // 0 <= N <= 500000. 고장난 버튼이 있을 경우 6자리 수까지 확인
            int len = possible(i, isBroken); // i번 채널까지 숫자 버튼을 사용하여 이동하는 횟수 계산
            if(len > 0){
                int press = Math.abs(N - i); // + 나 - 를 사용하여 이동하는 횟수
                result = Math.min(result, len + press);
            }
        }
        System.out.println(result);

        br.close();
    }

    // 주어진 채널로 이동할 수 있는지 체크하고, 가능하면 눌러야 하는 숫자 버튼의 횟수를 반환
    private static int possible(int channel, boolean[] isBroken) {
        if (channel == 0) {
            return isBroken[0] ? 0 : 1; // 0번 true(고장)이면 누를 수 없음(0) false(정상)이면 누름(1)
        }

        int len = 0;
        while(channel > 0){
            if(isBroken[channel % 10]){ // channel에서 각 자릿수 확인하여 고장여부 확인
                return 0; // 고장났으면 못누름
            }

            len++; // 고장나지 않았을 경우 누름
            channel /= 10;
        }
        return len;
    }
}