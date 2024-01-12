import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 집합 A의 원소 개수
        int M = Integer.parseInt(st.nextToken()); // 집합 B의 원소 개수

        Set<Integer> setA = new TreeSet<>(); // 이진 검색 트리를 활용하여 자료 정렬
        st = new StringTokenizer(br.readLine(), " "); // 집합 A set에 추가
        for(int i = 0; i < N; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++){
            int numB = Integer.parseInt(st.nextToken());
            if(setA.contains(numB)){ // 집합 A에서 B의 원소 제거
                setA.remove(numB);
            }
        }

        // 차집합의 크기
        StringBuilder sb = new StringBuilder();
        sb.append(setA.size()+"\n");
        for (Integer num : setA) {
            sb.append(num+ " ");
        }
        System.out.println(sb);
//        if(N == setA.size() || setA.size() == 0){ // A ⊂ B (집합 A에는 속하면서 집합 B에는 속하지 않는 원소가 없는 경우) || setA가 비어있는 경우
//            System.out.println(0);
//        }else{
//            System.out.println(setA.size());
//            StringBuilder sb = new StringBuilder();
//            for(int n : setA){
//                sb.append(n + " ");
//            }
//            System.out.println(sb.toString());
//        }

        br.close();
    }
}