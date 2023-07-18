import java.io.IOException;

public class 로그인성공 {
    public static void main(String[] args) throws IOException {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"meosseugi", "14"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println(solution(id_pw, db));
    }

    private static String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        String pw = id_pw[1];
        for(int i = 0; i < db.length; i++){
            if(db[i][0].equals(id)){
                if(db[i][1].equals(pw)){
                    answer = "login";
                    break;
                }
                answer = "wrong pw";
            }else if(!answer.equals("wrong pw")){
                answer = "fail";
            }
        }
        return answer;
    }
}
