class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int remainder = n % 3;
            sb.append(remainder);
            n /= 3;
        }
//        sb.reverse().toString(); // 3진법
        sb.toString(); // 3진법 앞뒤반전

        int decimal = 0;
        int power = 0;
        for (int i = sb.length() - 1; i >= 0; i--){
            int digit = Character.getNumericValue(sb.charAt(i));
            decimal += digit * Math.pow(3, power);
            power++;
        }

        int answer = decimal;

        return answer;
    }
}