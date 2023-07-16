import java.io.IOException;

public class 직사각형넓이구하기 {
    public static void main(String[] args) throws IOException {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "sop", "qixm", "adio", "soo", "ppssood"};
        System.out.println(solution(spell, dic));

    }

    private static int solution(String[] spell, String[] dic) {
        int answer = 0;
        for (int i = 0; i < dic.length; i++){
            for (int j = 0; j < spell.length; j++){
                if(!dic[i].contains(spell[j])) {
                    break;
                }
                if(j == spell.length - 1){
                    return 1;
                }
            }
        }
        return answer;
    }
}
