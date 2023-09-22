import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int aLife = sc.nextInt();
        int b = sc.nextInt();
        int bLife = sc.nextInt();
        while(aLife > 0 && bLife > 0){
            aLife -= b;
            bLife -= a;
        }
        if(aLife <= 0 && bLife <= 0){
            System.out.println("DRAW");
        }else if(aLife <= 0){
            System.out.println("PLAYER B");
        }else{
            System.out.println("PLAYER A");
        }
    }
}