import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        int[] tab = new int[bridges];
        for (int i = 0; i < bridges; i++) {
            tab[i] = scanner.nextInt();
        }
        int j = 1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] <= busHeight) {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            }
            j++;
            if (j > tab.length) {
                System.out.println("Will not crash");
            }
        }
    }
}