import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //한 변의 길이가 다른 두 변의 길이의 합보다 작은 경우 삼각형
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if(a + b <= c){
            c = a + b - 1;
        }
        if(a + c <= b){
            b = a + c - 1;
        }
        if(b + c <= a){
            a = b + c - 1;
        }
        System.out.println(a + b + c);
    }
}