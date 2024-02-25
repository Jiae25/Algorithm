import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int L;
    private static int C;
    private static String[] selected;
    private static String[] alphabet;
    private static boolean[] visited;
    private static BufferedWriter bw;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        L = Integer.parseInt(st.nextToken()); // 암호 구성 개수
        C = Integer.parseInt(st.nextToken()); // 주어진 알파벳 개수

        selected = new String[L]; // 암호저장
        alphabet = new String[C]; // 알파벳 저장
        visited = new boolean[C];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < C; i++){
            alphabet[i] = st.nextToken();
        }
        Arrays.sort(alphabet); // 오름차순 정렬

        dfs(0, 0); // start, depth

        bw.close();
        br.close();
    }

    private static void dfs(int start, int depth) throws IOException {
        if(depth == L){
            if(checkPassword()){
                for(String s : selected){
                    bw.write(s);
                }
                bw.write("\n");
            }
            return;
        }
        for(int i = start; i < alphabet.length; i++){
            if(!visited[i]){
                visited[i] = true;
                selected[depth] = alphabet[i];
                dfs(i + 1,depth + 1);
                visited[i] = false;
            }
        }

    }


    // 최소 1개 모음, 2개 자음 (vowel 모음 consonant 자음)
    private static boolean checkPassword() { // selected에서 모음이 1개 이상인지 확인
        boolean vowelCheck = false;
        int consonantCnt = 0;

        for(int i = 0; i < selected.length; i++){
            String s = selected[i];
            if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")){
                vowelCheck = true; // 모음 한개라도 있을 때
            }else{
                consonantCnt++;
            }
        }

        if(vowelCheck && consonantCnt >= 2){ // 모음 or 자음만 있을 경우도 있으니까 체크
            return true;
        }else{
            return false;
        }
    }
}