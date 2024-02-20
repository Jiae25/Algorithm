import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int nLen = N.length(); // N의 길이
        int tLen = (Integer.parseInt(N) - createZero(nLen - 1) + 1) * nLen; // 가장 큰 자릿수(nLen)의 길이
        for(int i = 0; i < nLen - 1; i++){
            tLen += (createNine(i) - createZero(i) + 1) * (i + 1); // nLen의 길이를 제외한 모든 자릿수의 합
        }

        System.out.println(tLen);

        br.close();
    }

    private static int createNine(int length) { // 각 자릿수에 맞게 999 생성
        String num = "9";
        for(int i = 0; i < length; i++){
            num += "9";
        }
        return Integer.parseInt(num);
    }

    private static int createZero(int length) { // 각 자릿수에 맞게 1000 생성
        String num = "1";
        for(int i = 0; i < length; i++){
            num += "0";
        }
        return Integer.parseInt(num);
    }
}