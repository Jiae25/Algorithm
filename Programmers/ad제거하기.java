import java.io.IOException;
import java.util.Arrays;


public class ad제거하기 {
    public static void main(String[] args) throws IOException{
        String[] strArr = {"and","notad","abcd"};
        System.out.println(Arrays.toString(solution(strArr)));
    }

    private static String[] solution(String[] strArr) {
        // List<String> list = new ArrayList<>();
        // for(String s : strArr){
        //     if(!s.contains("ad")){
        //         list.add(s);
        //     }
        // }
        // String[] answer = new String[list.size()];
        // for(int i = 0; i < answer.length; i++){
        //     answer[i] = list.get(i);
        // }
        // return answer;

        String[] answer = Arrays.stream(strArr).filter(s -> !s.contains("ad")).toArray(String[]::new);
        // Arrays.stram(strArr) : strArr 배열을 스트림으로 변환 (스트림은 요소들의 연속된 흐름을 나타내며, 배열의 요소들을 순차적으로 처리할 수 있게 한다)
        // .filter(s -> !s.contains("ad")) : 스트림의 각 요소에 대해 필터링 작업을 수행. 람다 표현식은 각 문자열 s 가 ad를 포함하지 않는지 확인하는 조건
        // .toArray(String[]::new) : 필터링된 요소들을 새로운 문자열 배열로 변환.
        // toArray 메서드가 스트림의 요소들을 배열로 수집. String[]::new 는 새로운 문자열 배열을 생성하기 위한 생성자 참조
        return answer;
    }
}