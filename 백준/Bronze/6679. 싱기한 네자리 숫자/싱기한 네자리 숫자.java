import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 1000; i < 10000; i++){
            int decimalSum = getSum(i, 10);
            int dozenSum = getSum(i, 12);
            int hexSum = getSum(i, 16);
            if(decimalSum == dozenSum && dozenSum == hexSum){
                sb.append(i + "\n");
            }
        }
        System.out.println(sb.toString());
    }

    private static int getSum(int num, int base) {
        int sum = 0;
        while(num > 0){
            sum += num % base;
            num /= base;
        }
        return sum;
    }

}