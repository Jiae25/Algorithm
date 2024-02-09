import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader를 사용하여 입력을 받음
        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()) { // 입력이 null이거나 비어있을 때까지 반복
            int n = Integer.parseInt(input); // 입력된 문자열을 정수로 변환
            int num = 0; // 1로만 이루어진 수를 저장할 변수
            int cnt = 0; // 수를 만들기 위해 1을 더한 횟수를 저장할 변수
            
            while(true){ // 1로만 이루어진 수 찾기
                num = (num * 10 + 1) % n;
                cnt++;

                if(num == 0){
                    System.out.println(cnt);
                    break;
                }

            }
        }
        br.close(); // BufferedReader를 닫음
    }
}