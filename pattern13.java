public class pattern13 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.print(a * a);
            a = a * 10 + 1;
            System.out.println();
        }
    }
}
