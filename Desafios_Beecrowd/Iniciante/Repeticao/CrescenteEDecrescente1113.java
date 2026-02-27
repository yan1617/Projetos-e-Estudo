import java.util.Scanner;

public class beecrowd_1113 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = 0;
        int y = 0;
        do {
            x = scan.nextInt();
            y = scan.nextInt();

            if (x > y) {
                System.out.println("Decrescente");
            } else if (y > x) {
                System.out.println("Crescente");
            } else {

            }

        } while (x != y);
        scan.close();
    }

}
