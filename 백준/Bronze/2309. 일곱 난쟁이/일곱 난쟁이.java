import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nineArr = new int[10]; // 1 ~ 9 인덱스를 사용
        int nineSum = 0; // 9명 키의 총 합을 저장할 변수
        for(int i = 1; i < 10; i++){ // 배열에 9명의 키 저장
            int height = Integer.parseInt(br.readLine());
            nineArr[i] = height;
            nineSum += height; // 9명 키의 합
        }

        Arrays.sort(nineArr); // 배열 오름차순 정렬

        int[] except = findDwarf(nineArr, nineSum); // 뺄 2명 찾기

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < 10; i++){
            if(i == except[0] || i == except[1]){
                continue;
            }else{
                sb.append(nineArr[i] + "\n");
            }
        }
        System.out.println(sb.delete(sb.length() - 1, sb.length()));

    }

    private static int[] findDwarf(int[] nineArr, int nineSum) {
        for(int i = 1; i < 10; i++){
            for(int j = i + 1; j < 10; j++){
                int sevenDwarf = nineSum - (nineArr[i] + nineArr[j]);
                if(sevenDwarf == 100){
                    return new int[]{i, j};
                }else if(sevenDwarf < 100){ // 오름차순으로 정렬해둔 배열이기 때문에 더 계산할 필요가 없음
                    break;
                }
            }
        }
        return new int[]{0}; // 일곱난쟁이를 찾을 수 없는 경우는 없다.
    }
}