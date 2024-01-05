import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static String[] arr;
    private static boolean[] visited;
    private static int[] selected;
    private static long sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 단어의 개수

        HashSet<String> wordSet = new HashSet<>(); // 단어의 중복 제거를 위해 HashSet 사용
        for(int i = 0; i < N; i++){
            String word = br.readLine();
            wordSet.add(word);
        }

        List<String> wordList = new ArrayList<>(wordSet); // HashSet을 ArrayList으로 변환하여 정렬
        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length()){ // 길이가 짧은 것부터
                    return Integer.compare(o1.length(), o2.length());
                }
                return o1.compareTo(o2); // 길이가 같으면 사전순으로 정렬
            }
        });

        StringBuilder answer = new StringBuilder();
        for(String word : wordList){
            answer.append(word + "\n");
        }

        System.out.println(answer.toString());
    }
}