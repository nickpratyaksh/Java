public class pattern5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            for (int k = 4; k >= i; k--)
                System.out.print(" " + " ");
            for (int l = i; l >= 1; l--)
                System.out.print(l);
            System.out.println();
        }
    }
}
