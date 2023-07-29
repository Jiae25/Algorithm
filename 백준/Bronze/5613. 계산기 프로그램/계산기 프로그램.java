import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(br.readLine());
        char cal = 0;
        int num = 0;
        for (int i = 0; ; i++){
            if(i % 2 == 1){
                num = Integer.parseInt(br.readLine());
                if(cal == '+'){
                    answer += num;
                }else if(cal == '-'){
                    answer -= num;
                }else if(cal == '*'){
                    answer *= num;
                }else if(cal == '/'){
                    answer /= num;
                }
            }else{
                cal = br.readLine().charAt(0);
                if(cal == '=') break;
            }
        }
        System.out.println(answer);
    }
}