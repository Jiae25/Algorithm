import java.io.*;
import java.util.*;

public class BOJ_17256_달달함이넘쳐흘러 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int ax = Integer.parseInt(st.nextToken());
        int ay = Integer.parseInt(st.nextToken());
        int az = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        int cx = Integer.parseInt(st.nextToken());
        int cy = Integer.parseInt(st.nextToken());
        int cz = Integer.parseInt(st.nextToken());

        System.out.println((cx - az) + " " + (cy / ay) + " " + (cz - ax));

    }
}

