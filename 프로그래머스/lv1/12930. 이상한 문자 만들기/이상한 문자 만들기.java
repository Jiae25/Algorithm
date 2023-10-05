class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0; // 단어의 인덱스를 나타내는 변수
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(c); // 공백 문자는 그대로 추가
                index = 0; // 다음 단어로 이동
            } else {
                if (index % 2 == 0) {
                    answer.append(Character.toUpperCase(c)); // 짝수번째 알파벳은 대문자로 변환
                } else {
                    answer.append(Character.toLowerCase(c)); // 홀수번째 알파벳은 소문자로 변환
                }
                index++;
            }
        }
        return answer.toString();
    }
}