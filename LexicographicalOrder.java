import java.util.Scanner;

public class LexicographicalOrder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= 9; i++) {
            printLexicographical(i, n);
        }
        scan.close();
    }

    public static void printLexicographical(int current, int limit) {
        if (current > limit) {
            return;
        }

        System.out.print(current+" ");

        for (int i = 0; i <= 9; i++) {
            int next = current * 10 + i;
            if (next > limit) {
                return;
            }
            printLexicographical(next, limit);
        }
    }
}
