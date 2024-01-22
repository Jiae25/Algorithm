import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> group = new HashSet<>();
        for(int i = 0; i < N; i++){
            char[] input = br.readLine().toCharArray();
            Arrays.sort(input);
            String word = "";
            for(char c: input){
                word += c;
            }
            group.add(word);
        }
        System.out.println(group.size());
    }
}