import java.io.IOException;

public class 문자열여러번뒤집기 {
    public static void main(String[] args) throws IOException {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(solution(my_string, queries));
    }
    private static String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for(int[] arr : queries){
            answer = answer.substring(0, arr[0]) + new StringBuilder(answer.substring(arr[0], arr[1] + 1)).reverse().toString() + answer.substring(arr[1] + 1) ; // StringBuilder를 새로 생성해줘야 중첩되지 않는다.
        }

//        for (int i = 0; i < queries.length; i++){
//            int s = queries[i][0];
//            int e = queries[i][1];
//            String change = "";
//            for (int j = e, idx = s; j >= s; j--, idx++){
//                change += answer.charAt(j);
//            }
//            answer = answer.substring(0, s) + change + answer.substring(e + 1);
//        }
        return answer;
    }
}