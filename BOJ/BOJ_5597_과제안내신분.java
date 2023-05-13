import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5597_과제안내신분 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] students = new boolean[31];
        for(int i = 0; i < 28; i++){
            students[Integer.parseInt(br.readLine())] = true;
        }
        for (int i = 1; i < 31; i++){
            if(students[i] == false){
                System.out.println(i);
            }
        }
    }
}
