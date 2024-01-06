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
        String input = br.readLine();

        List<Character> numList = new ArrayList<>();
        for(int i = 0; i < input.length(); i++){
            numList.add(input.charAt(i));
        }

        Collections.sort(numList, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.compare(o2, o1);
            }
        });

        StringBuilder answer = new StringBuilder();
        for(Character word : numList){
            answer.append(word);
        }

        System.out.println(answer.toString());
    }
}