class Solution {
    public String solution(String s) {
        String answer = "";
        String[] word = s.split(" ");
        for (int i = 0; i < word.length; i++){
            if(word[i].length() == 0){
                answer += " ";
            }else{
                String first = word[i].substring(0,1).toUpperCase();
                String last = word[i].substring(1).toLowerCase();
                answer += first + last + " ";
            }
        }
        if(s.length() != answer.length()){
            answer = answer.substring(0,answer.length()-1);
        }
        return answer;
    }
}