public class pattern15 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int s = 5; s > i; s--)
                System.out.print(" ");
            for (int j = i; j >= 0; j--)
                System.out.print(j);
            for (int k = 1; k <= i; k++)
                System.out.print(k);
            System.out.println();
        }
    }
}
