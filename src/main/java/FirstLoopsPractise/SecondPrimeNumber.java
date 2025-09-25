package FirstLoopsPractise;

public class SecondPrimeNumber {
    public static void main(String[] args) {
        int n = 7;
//        for (int i = 2; i < 5; i++) {
//            if (n % i == 0) {
//                System.out.println("not prime number");
//            } else {
//                System.out.println("prime number");
//            }
//        }
        //the above is not optimized method
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (j % n == 0) {
                System.out.println("Not Prime number");
            } else {
                System.out.println("prime number");
            }
        }
    }

}
