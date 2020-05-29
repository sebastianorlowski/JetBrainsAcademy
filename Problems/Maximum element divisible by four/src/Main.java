import java.util.Scanner;

class Main {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = input.nextInt();
        int number;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            number = input.nextInt();
            if (number % 4 == 0 && number > temp) {
                temp = number;
            }
        }
        System.out.println(temp);
    }
}