import java.io.BufferedReader;
import java.io.*;

public class BOJ_2744_대소문자바꾸기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 95){ // 소문자
                answer += s.substring(i, i+1).toUpperCase();
            }else{
                answer += s.substring(i, i+1).toLowerCase();
            }
        }
        System.out.println(answer);
    }
}
