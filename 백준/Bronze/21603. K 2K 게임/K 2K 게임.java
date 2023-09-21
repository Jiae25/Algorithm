import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = k % 10;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            int one = i % 10;
            if(one != x && one != (2 * x)){
                arr.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(arr.size() + "\n");
        for (int num : arr){
            sb.append(num + " ");
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb.toString());
    }
}