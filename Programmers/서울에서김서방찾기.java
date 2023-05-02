public class 서울에서김서방찾기 {
    public static String solution(String[] seoul) {
        String answer = "";
        int len = seoul.length;
        for (int i = 0; i < len; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + Integer.toString(i) + "에 있다";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "","Kim"};

        System.out.println(solution(seoul));
    }
}