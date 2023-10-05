import java.util.Arrays;
class Solution {
    public int solution(int[] number) {
        int count = 0; // 삼총사의 방법 수를 저장할 변수

        // 주어진 학생들 중 3명을 선택하여 조합을 만든 후 합을 계산
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    int sum = number[i] + number[j] + number[k];
                    if (sum == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}