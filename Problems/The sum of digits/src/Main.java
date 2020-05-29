import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int firstNumber = number / 100;
        int secondNumber = (number % (firstNumber * 100)) / 10;
        int thirdNumber = number % (firstNumber * 100 + secondNumber * 10);

        System.out.println(firstNumber + secondNumber + thirdNumber);

    }
}
