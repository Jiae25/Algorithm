import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int left = 0, right = 0;
        int sum = 0;
        int[] answer = new int[2];
        int length = Integer.MAX_VALUE;
        while(right < sequence.length && left <= right){
            if(left == right){
                sum = sequence[left]; // 초기값, 포인터 같을때
            }
            if (sum < k){
                if(right + 1 < sequence.length){
                    sum += sequence[right + 1];
                }
                right++;
            }else if(sum > k){
                sum -= sequence[left];
                left++;
            }else if(sum == k){
                if(length > right - left){
                    length = right - left;
                    answer[0] = left;
                    answer[1] = right;
                }
                sum -= sequence[left];
                if(right + 1 < sequence.length){
                    sum += sequence[right + 1];
                }
                if(left == right){
                    break;
                }
                left++;
                right++;
            }
        }
        return answer;
    }
}