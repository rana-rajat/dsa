package ThirdAdvancePattern;

public class FirstHollowRectanglePattern {
    public static void hollowRectangle(int row, int coloumn) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= coloumn; j++) {
                if (i == 1 || i == row || j == 1 || j == coloumn) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > 1 && i < n - 1) {
                    if (j > 1 && j < 5) {
                        System.out.print("  ");
                    } else {
                        System.out.print("*" + " ");
                    }
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
        FirstHollowRectanglePattern.hollowRectangle(5,4);
    }
}
