package ThirdAdvancePattern;

import java.util.Scanner;

public class EightDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (top half rows): ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("n must be positive.");
            return;
        }

        // Top half (including middle)
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            // stars (2*i - 1)
            for (int j = 0; j < 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }

        // Bottom half (below middle)
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }
}
