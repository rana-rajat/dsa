package FirstLoopsPractise;

public class FourthDecimalToBinary {
    public static void main(String[] args) {
        int num = 5434;
        int binNumb = 0;
        int power = 0;
        while (num > 0) {
            int rem = num % 2;
            binNumb = (int) (binNumb + rem * Math.pow(10, power));
            num = num / 2;
            power++;
        }
        System.out.println(binNumb);
    }
}
