public class pattern10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--)
                System.out.print(" ");
            for (int k = 1; k < i * 3; k++)
                if (k % 3 == 0 || k == 1)
                    System.out.print(k);
            System.out.println();
        }
    }
}
