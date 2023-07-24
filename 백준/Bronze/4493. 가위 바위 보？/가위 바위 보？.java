import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++){
            int n = Integer.parseInt(br.readLine());
            int p1 = 0, p2 = 0;
            for (int i = 0; i < n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                int check = checkWinner(st.nextToken().charAt(0), st.nextToken().charAt(0));
                if(check == 1) p1++;
                else if(check == 2) p2++;
            }
            if(p1 > p2) {
                System.out.println("Player 1");
            }else if(p1 < p2){
                System.out.println("Player 2");
            }else{
                System.out.println("TIE");
            }
        }
    }

    private static int checkWinner(char a, char b) {
        int winner = 0;
        if(a == 'R' && b == 'P'){
            winner = 2;
        }else if(a == 'R' && b == 'S'){
            winner = 1;
        }else if(a == 'P' && b == 'R'){
            winner = 1;
        }else if(a == 'P' && b == 'S'){
            winner = 2;
        }else if(a == 'S' && b == 'R'){
            winner = 2;
        }else if(a == 'S' && b == 'P'){
            winner = 1;
        }
        return winner;
    }
}