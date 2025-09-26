package FirstLoopsPractise;

public class ThirdBInaryToDecimal {
    public static int binaryToDecimal(int n) {
        int power = 0;
        int decimal = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            decimal = (int) (decimal + lastDigit * Math.pow(2, power));
            n = n / 10;
            power++;

        }
        return decimal;
    }

    public static void main(String[] args) {
        int i = ThirdBInaryToDecimal.binaryToDecimal(1010101);
        System.out.println(i);

    }
}
