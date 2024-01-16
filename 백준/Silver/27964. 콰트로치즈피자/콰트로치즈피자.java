import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> topping = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++){
            String input = st.nextToken();
            if(input.length() >= 6 && input.substring(input.length() - 6, input.length()).equals("Cheese")){
                topping.add(input);
            }
        }

        if(topping.size() >= 4){
            System.out.println("yummy");
        }else{
            System.out.println("sad");
        }
    }
}