import java.util.Scanner;

class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        final long M = input.nextLong();
        long n = 1L;
        int j = 0;
        while(n <= M) {
                j++;
                n *= j;
            }
        System.out.println(j);
        }
    }
