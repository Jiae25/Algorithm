import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 사람의 수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] time = new int[N];
        for (int i = 0; i < N; i++){
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time); // 오름차순 정렬. 앞에 시간이 작을수록 누적 시간이 작다.

        int totalWatingTime = 0;
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += time[i]; // 누적 대기 시간
            totalWatingTime += sum; // 전체 대기 시간
        }
        System.out.println(totalWatingTime);
    }
}