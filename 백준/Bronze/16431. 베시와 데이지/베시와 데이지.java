import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] besStart = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] daiStart = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] end = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();;

        int bmin = Math.min(Math.abs(besStart[0] - end[0]),Math.abs(besStart[1] - end[1]));
        int bsum = Math.abs(besStart[0] - end[0]) + Math.abs(besStart[1] - end[1]) - bmin;
        int dsum = Math.abs(daiStart[0] - end[0]) + Math.abs(daiStart[1] - end[1]);
        if (bsum > dsum) {
            System.out.println("daisy");
        } else if (bsum < dsum) {
            System.out.println("bessie");
        }else{
            System.out.println("tie");
        }
    }
}