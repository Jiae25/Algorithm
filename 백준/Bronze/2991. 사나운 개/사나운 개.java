import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dogs = new int[4];
        for (int i = 0; i < 4; i++){
            dogs[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int[] people = new int[3];
        for (int i = 0; i < 3; i++){
            people[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 3; i++){
            int answer = 0;
            if(people[i] % (dogs[0] + dogs[1]) != 0 && people[i] % (dogs[0] + dogs[1]) <= dogs[0]){
                answer++;
            }
            if(people[i] % (dogs[2] + dogs[3]) != 0 && people[i] % (dogs[2] + dogs[3]) <= dogs[2]){
                answer++;
            }
            System.out.println(answer);
        }
    }
}