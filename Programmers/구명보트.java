import java.util.Arrays;

public class 구명보트 {
    public static void main(String[] args) {
        int[] people = {70,80,50};
        int limit = 100;
        System.out.println(solution(people, limit));
    }

    private static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        while(left <= right){
            int sum = people[left] + people[right];
            if(sum <= limit){
                left++;
            }
            right--;
            answer++;
        }
        return answer;
    }
}
