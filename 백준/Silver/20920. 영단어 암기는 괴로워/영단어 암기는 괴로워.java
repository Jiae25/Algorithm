import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 단어의 개수
        int M = Integer.parseInt(st.nextToken()); // 외울 단어의 최소길이

        HashMap<String, Integer> wordMap = new HashMap<>();
        for(int i = 0; i < N; i++){
            String word = br.readLine();
            if(word.length() >= M){
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordMap.entrySet());
        Collections.sort(wordList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> w1, Map.Entry<String, Integer> w2) {
                // 자주 나오는 단어일수록 앞에 배치
                int freqCompare = Integer.compare(w2.getValue(), w1.getValue());
                if (freqCompare != 0) {
                    return freqCompare;
                }

                // 해당 단어의 길이가 길수록 앞에 배치
                int lengthCompare = Integer.compare(w2.getKey().length(), w1.getKey().length());
                if (lengthCompare != 0) {
                    return lengthCompare;
                }

                // 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치
                return w1.getKey().compareTo(w2.getKey());
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : wordList){
            sb.append(entry.getKey() + "\n");
        }
        System.out.println(sb.delete(sb.length() - 1, sb.length()));
    }
}