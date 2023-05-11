
public class N개의최소공배수 {
    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        System.out.println(solution(arr));
    }
    private static int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++){
            answer = answer * arr[i] / gcd(answer, arr[i]);
        }
        return answer;
    }

    private static int gcd(int r1, int r2) {
        while(r2 != 0){
            int r = r1 % r2;
            r1 = r2;
            r2 = r;
        }
        return r1;
    }
}
