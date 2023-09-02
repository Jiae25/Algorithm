import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String color1 = scanner.next(); // 첫 번째 색깔
        String color2 = scanner.next(); // 두 번째 색깔
        String multiplier = scanner.next(); // 곱하는 값 색깔

        scanner.close();

        long resistanceValue = (10 * getValue(color1) + getValue(color2)) * (long) Math.pow(10, getValue(multiplier));
        System.out.println(resistanceValue);
    }

    // 색깔에 해당하는 값을 반환하는 함수
    private static int getValue(String color) {
        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        for (int i = 0; i < colors.length; i++) {
            if (color.equals(colors[i])) {
                return i;
            }
        }
        return 0; // 예외 처리, 알 수 없는 색깔은 0으로 처리
    }
}