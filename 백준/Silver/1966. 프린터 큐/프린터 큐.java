import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken()); //문서의 개수
            int M = Integer.parseInt(st.nextToken()); //인쇄순서가 궁금한 문서의 위치

            LinkedList<int[]> q = new LinkedList<>(); // Queue로 활용할 연결 리스트
            st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < N; i++){
                int priority = Integer.parseInt(st.nextToken());
                q.offer(new int[] { i, priority }); //문서의 초기 위치와 중요도를 추가
            }
            int count = 0; //출력할 순서

            while (!q.isEmpty()) {
                int[] front = q.poll(); //첫번째 문서
                boolean isMax = true; //front의 중요도가 가장 큰지 확인하는 변수

                for (int i = 0; i < q.size(); i++){ //큐에 남아있는 문서들과 중요도 비교
                    if(front[1] < q.get(i)[1]){ //front보다 큐에 있는 i번째 문서 중요도가 큰 경우
                        q.offer(front); //뽑았던 front와 i 이전의 문서들을 뒤로 보낸다.
                        for (int j = 0; j < i; j++){
                            q.offer(q.poll());
                        }
                        isMax = false; //front가 가장 큰 중요도가 아니었으므로 false 후 탐색을 마침
                        break;
                    }
                }
                if(isMax == false) {
                    continue;
                }
                count++; //front가 가장 큰 경우이므로 해당 문서는 출력
                if(front[0] == M){ // 찾고자 하는 문서위치라면 종료
                    break;
                }
            }
            System.out.println(count);

        }

    }
}