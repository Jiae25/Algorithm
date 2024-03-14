import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 명령의 수

        Queue<Integer> queue = new LinkedList<>();
        int last = 0;
        int num = 0;
        for(int i = 0; i < N; i++){
            String input = br.readLine();

            if(input.length() > 4 && input.substring(0, 4).equals("push")){ // pop일 때 StringIndexOutOfBoundsException 발생하므로 4자 이상일때만 체크
                num = Integer.parseInt(input.substring(5));
                last = num;
                input = "push";
            }

            switch (input){
                case "push" :
                    queue.add(num);
                    break;
                case "pop" :
                    if(queue.isEmpty()){
                        sb.append(-1).append("\n");
                        last = -1;
                    }else{
                        sb.append(queue.poll()).append("\n");
                    }
                    break;
                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    if(queue.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(queue.peek()).append("\n");
                    }
                    break;
                case "back" :
                    sb.append(!queue.isEmpty() ? last : -1).append("\n");
                    break;
            }
        }
        // 결과 출력
        System.out.println(sb.toString());
        
        br.close();
    }
}
