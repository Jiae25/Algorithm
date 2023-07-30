import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = br.readLine();
            if(str.length() == 1 && Integer.parseInt(str) == 0) break;
            while(str.length() > 1){
                int sum = 0;
                for(char c : str.toCharArray()){
                    sum += c - '0';
                }
                str = sum + "";
            }
            System.out.println(str);
        }
    }
}