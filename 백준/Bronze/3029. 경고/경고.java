import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] startTime = Arrays.stream(br.readLine().split(":")).mapToInt(Integer::parseInt).toArray();
        int[] endTime = Arrays.stream(br.readLine().split(":")).mapToInt(Integer::parseInt).toArray();

        int[] answer = new int[3];
        for (int i = 0; i < 3; i++){
            answer[i] = endTime[i] - startTime[i];
        }
        if(Arrays.equals(startTime, endTime)){
            answer[0] = 24;
        }
        if (answer[2] < 0) {
            answer[2] += 60;
            answer[1]--;
        }
        if(answer[1] < 0){
            answer[1] += 60;
            answer[0]--;
        }
        if(answer[0] < 0){
            answer[0] += 24;
        }
        System.out.printf("%02d:%02d:%02d", answer[0], answer[1], answer[2]);
    }
}