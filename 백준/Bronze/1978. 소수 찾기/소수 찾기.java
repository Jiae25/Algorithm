import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < input.length; i++){
            if(isPrime(Integer.parseInt(input[i]))) answer += 1;
        }
        System.out.println(answer);
    }

    private static boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }
        for (int i = 2; i * i <= num; i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}