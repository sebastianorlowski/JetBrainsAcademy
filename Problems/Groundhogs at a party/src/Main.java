import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int cups = scanner.nextInt();
        final boolean isWeekend = scanner.nextBoolean();

        final boolean isSuccessfulWeekend = cups >= 15 && cups <= 25 && isWeekend;
        final boolean isSuccessfulNotWeekend = cups >= 10 && cups <= 20 && !isWeekend;

        System.out.println(isSuccessfulWeekend || isSuccessfulNotWeekend);
    }
}