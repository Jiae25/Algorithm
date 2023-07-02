import java.io.IOException;
import java.util.Arrays;

public class 조건에맞게수열변환하기2 {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(solution(arr));

    }

    private static int solution(int[] arr) {
        int answer = 0;
        int cnt = 0;
        while(true){
            int[] nArr = new int[arr.length];
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > 50 && arr[i] % 2 == 0){
                    nArr[i] = arr[i] / 2;
                }else if(arr[i] < 50 && arr[i] % 2 != 0){
                    nArr[i] = arr[i] * 2 + 1;
                }else{
                    nArr[i] = arr[i];
                }
            }
            cnt++;
            if(Arrays.equals(arr, nArr)){
                answer = cnt - 1;
                break;
            }
            arr = Arrays.copyOf(nArr, nArr.length);
        }
        return answer;
    }
}
