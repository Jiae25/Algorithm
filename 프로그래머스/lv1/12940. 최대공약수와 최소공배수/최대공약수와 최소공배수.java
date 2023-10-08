class Solution {
    public int[] solution(int n, int m) {
        return new int[]{gcd(n, m), lcm(n, m)};
    }

    private static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }

    private static int gcd(int n, int m) {
        if(m == 0){
            return n;
        }
        return gcd(m, n % m);
    }
}