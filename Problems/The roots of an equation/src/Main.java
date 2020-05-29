import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for(int x = 0, count = 0; x<= 1000 && count < 4; x++) {
            if(a * Math.pow(x, 3) + b * Math.pow(x,2) + c * x + d == 0) {
                System.out.println(x);
                count += 1;
            }
        }
    }
}