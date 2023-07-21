class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        for(int i = 0; i < A.length(); i++){
            if(A.equals(B)){
                answer = i;
                break;
            }
            char temp = A.charAt(A.length() - 1);
            A = temp + A.substring(0, A.length() - 1);
        }
        return answer;
    }
}