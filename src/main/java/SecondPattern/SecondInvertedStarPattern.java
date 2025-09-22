package SecondPattern;

public class SecondInvertedStarPattern {
    public static void main(String[] args) {
        int count = 5;
        for (int i = 1; i <= count; i++) {
            for (int j = i; j <= count; j++) {
                System.out.print("x ");
            }
            System.out.println();

        }
    }
}
//x x x x x
//x x x x
//x x x
//x x
//x
