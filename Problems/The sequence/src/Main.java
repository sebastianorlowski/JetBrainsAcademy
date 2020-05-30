import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = 1;
        int c = 0;

        while (a > c) {
            for (int i = 0; i < b; i++) {
                System.out.println(b);
                c++;
                if (c >= a) {
                    break;
                }
            }
            b++;
        }
    }
}
