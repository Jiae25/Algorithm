import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> dwarfList = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i < 9; i++){
            int height = Integer.parseInt(br.readLine());
            dwarfList.add(height);
            sum += height;
        }

        int except1 = 0;
        int except2 = 0;
        for(int i = 0; i < 8; i++){ // 2명을 골라야하니까 i는 8까지
            for(int j = i + 1; j < 9; j++){
                if(sum - (dwarfList.get(i) + dwarfList.get(j)) == 100){
                    except1 = dwarfList.get(i);
                    except2 = dwarfList.get(j);
                }
            }
        }

        Collections.sort(dwarfList);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 9; i++){
            if(dwarfList.get(i) == except1 || dwarfList.get(i) == except2){
                continue;
            }
            sb.append(dwarfList.get(i) + "\n");
        }
        System.out.println(sb.toString());
    }
}