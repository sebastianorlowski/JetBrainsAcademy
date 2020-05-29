import java.util.Scanner;

class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a = input.nextInt();
        int b = input.nextInt();
        double c = 0;
        double total = 0;

        for(int i=a;i<=b;i++) {
            if(i % 3 == 0) {
                c++;
                total += i;
            }
        }
        System.out.println(total / c);
    }
}