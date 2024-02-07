import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int[] count1 = new int[26]; // 알파벳 소문자 개수를 저장하는 배열
        int[] count2 = new int[26];

        // 첫 번째 문자열의 알파벳 개수
        for (int i = 0; i < str1.length(); i++) {
            int index = str1.charAt(i) - 'a';
            count1[index]++;
        }

        // 두 번째 문자열의 알파벳 개수
        for (int i = 0; i < str2.length(); i++) {
            int index = str2.charAt(i) - 'a';
            count2[index]++;
        }

        int result = 0;

        // 두 문자열 간의 알파벳 개수 차이 계산
        for (int i = 0; i < 26; i++) {
            result += Math.abs(count1[i] - count2[i]);
        }

        System.out.println(result);
    }
}