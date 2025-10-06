package ThirdAdvancePattern;

public class SecondRoatedHalfPyramid {
    public static void main(String[] args) {
        int count = 4;
        for (int i = 1; i <= count; i++) {
            //spaces
            for (int j = 1; j <= count - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
