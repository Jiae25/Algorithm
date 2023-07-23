import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        double c = Integer.parseInt(st.nextToken());
        double d = Integer.parseInt(st.nextToken());

        double[][] sortArr = {{(a / c + b / d), 0}, {(c / d + a / b), 1}, {(d / b + c / a), 2}, {(b / a + d / c), 3}};
        // 첫 번째 인덱스를 기준으로 오름차순으로 정렬
        Arrays.sort(sortArr, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o1[0], o2[0]);
            }
        });
        
        int answer = (int) sortArr[3][1];
        for (int i = 2; i >= 0 ; i--){
            if(sortArr[3][0] == sortArr[i][0]){
                answer = (int) sortArr[i][1];
            }
        }
        System.out.println(answer);
    }
}