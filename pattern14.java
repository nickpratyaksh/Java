public class pattern14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++)
                System.out.print(j);
            for (int k = 1; k < i; k++)
                System.out.print(k);
            System.out.println();
        }
    }
}
