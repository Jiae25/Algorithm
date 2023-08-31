import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null){
            int[] answer = new int[4]; // 소문자, 대문자, 숫자, 공백
            for (int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if(c == ' '){
                    answer[3]++;
                }else if(c >= '0' && c <= '9'){
                    answer[2]++;
                }else if(c >= 'A' && c <= 'Z'){
                    answer[1]++;
                }else if(c >= 'a' && c <= 'z'){
                    answer[0]++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int cnt : answer){
                sb.append(cnt + " ");
            }
            System.out.println(sb.toString());
        }
        br.close();
    }
}