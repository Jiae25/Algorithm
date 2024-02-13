import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] dwarfArr = new int[10]; // 1 ~ 9 인덱스를 사용
        int sum = 0; // 9명 키의 총 합을 저장할 변수
        for(int i = 1; i < 10; i++){ // 배열에 9명의 키 저장
            int height = Integer.parseInt(br.readLine());
            dwarfArr[i] = height;
            sum += height; // 9명 키의 합
        }

        Arrays.sort(dwarfArr); // 배열 오름차순 정렬

        for(int i = 1; i < 10; i++){
            for(int j = i + 1; j < 10; j++){
                int sevenDwarf = sum - (dwarfArr[i] + dwarfArr[j]);
                if(sevenDwarf == 100){
                    for(int k = 1; k < 10; k++){
                        if(k == i || k == j){
                            continue;
                        }else{
                            sb.append(dwarfArr[k] + "\n");
                        }
                    }
                    System.out.println(sb.delete(sb.length() - 1, sb.length()));
                    return;
                }else if(sevenDwarf < 100){ // 오름차순으로 정렬해둔 배열이기 때문에 더 계산할 필요가 없음
                    break;
                }
            }
        }
    }
}