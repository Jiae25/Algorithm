import java.io.*;

public class BOJ_10988_팰린드롬인지확인하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }
        int answer = 1;
        for (int i = 0; i < s.length() / 2; i++){
            if(arr[i] != arr[s.length() - (i + 1)]){
                answer = 0;
                break;
            }
        }
        System.out.println(answer);
    }
}