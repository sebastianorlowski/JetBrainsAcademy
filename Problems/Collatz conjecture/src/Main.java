import java.util.Scanner;

class Main {
    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number = input.nextInt();
        while (number > 1) {
            System.out.print(number + " ");
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
        }
        System.out.print(number);
    }
}
