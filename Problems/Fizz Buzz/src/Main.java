import java.util.Scanner;

class Main {
    static final Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
            final int a = input.nextInt();
            final int b = input.nextInt();

            for (int i = a; i <= b; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
}