public class GuguDan {
    public static void main(String[] args) {
        // Multiplication table from 2 to 9
        for (int i = 2; i <= 9; i++) {
            System.out.println("=== " + i + " dan ===");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
