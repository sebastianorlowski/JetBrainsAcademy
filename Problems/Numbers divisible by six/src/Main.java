import java.util.Arrays;
import java.util.Scanner;

class Main {
    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = input.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        int sum = Arrays.stream(number)
                .filter(i -> i % 6 == 0)
                .sum();
        System.out.println(sum);
    }
}