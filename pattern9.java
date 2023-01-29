public class pattern9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int s = 3; s >= i; s--)
                System.out.print(" ");
            for (int j = i; j >= 1; j--)
                System.out.print(j);
            for (int k = 2; k <= i; k++)
                System.out.print(k);
            System.out.println();
        }
    }
}
