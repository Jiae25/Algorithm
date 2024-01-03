class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = arrayA[0]; // A배열의 최대공약수
        for (int i = 1; i < arrayA.length; i++){
            gcdA = gcd(gcdA, arrayA[i]);
        }

        int gcdB = arrayB[0]; // B배열의 최대공약수
        for(int i = 1; i < arrayB.length; i++){
            gcdB = gcd(gcdB, arrayB[i]);
        }

        int answer = Math.max(0, divideGcd(arrayA, gcdB));
        answer = Math.max(answer, divideGcd(arrayB, gcdA));
        
        return answer;
    }

    private static int divideGcd(int[] arr, int num) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % num == 0){ // 안되는경우
                return 0;
            }
        }
        return num;
    }

    private static int gcd(int a, int b) { // 최대공약수
        if(a % b == 0){
            return b;
        }
        return gcd(b, a % b);
    }
}