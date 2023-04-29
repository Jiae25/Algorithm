/*
이진 변환 반복하기
 */
public class 이진변환반복하기 {
    static public int[] solution(String s) {
        int[] answer = {}; // 이진변환의 횟수, 이진변환 과정에서 제거한 모든 0의 개수
        int cnt = 0;
        int zero = 0;
        while(!s.equals("1")){ // 이진변환하여 s가 1이 될때까지 수행
            cnt++;
            int length = s.length();
            String ns = "";
            // s의 0 제거
            for (int i = 0; i < s.length(); i++){
                if(s.charAt(i) != '0'){
                    ns += s.charAt(i);
                }else{
                    zero++;
                }
            }
            s = ns;
            // s의 길이 c의 값을 2진법으로 표현한 문자열
            int c = s.length();
            String binary = "";
            while(c > 0){
                int num = c % 2;
                binary += num;
                c /= 2;
            }
            s = binary;
        }
        answer  = new int[]{cnt, zero};
        return answer;
    }

    public static void main(String[] args) {
        String s = "110010101001";
        System.out.println(solution(s));
    }
}