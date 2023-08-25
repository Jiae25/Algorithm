import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String plates = br.readLine();
        int answer = 10;
        for (int i = 1; i < plates.length(); i++){
            if(plates.charAt(i) == plates.charAt(i - 1)){
                answer += 5;
            }else{
                answer += 10;
            }
        }
        System.out.println(answer);
        br.close();
    }
}