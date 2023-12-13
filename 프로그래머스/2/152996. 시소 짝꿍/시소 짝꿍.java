import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        long[] cntWeights = new long[1001];
        for (int i = 0; i < weights.length; i++){ // weight를 index로 하여 개수체크
            cntWeights[weights[i]]++;
        }
        for (int i = 100; i < 1001; i++){
            if(cntWeights[i] >= 2){
                long cnt = cntWeights[i]; // 같은 weight의 개수
                answer += ((cnt - 1) * cnt) / 2; // 짝의 개수
            }
        }
        for (int i = 100; i < 1001; i++){
            if(cntWeights[i] > 0){ // weight에 존재하는 값
                // 2:3, 2:4(1:2), 3:4 비율로 확인
                if(i % 2 == 0 && i * 3 / 2 < 1001 && cntWeights[i * 3 / 2] > 0){
                    answer += cntWeights[i] * cntWeights[i * 3 / 2];
                }
                if(i * 2 < 1001 && cntWeights[i * 2] > 0){
                    answer += cntWeights[i] * cntWeights[i * 2];
                }
                if(i % 3 == 0 && i * 4 / 3 < 1001 && cntWeights[i * 4 / 3] > 0){
                    answer += cntWeights[i] * cntWeights[i * 4 / 3];
                }
            }
        }
        return answer;
    }
}