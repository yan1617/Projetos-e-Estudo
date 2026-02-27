import java.util.Scanner;

public class beecrowd_1078 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int i;

        for (i = 1; i <= 10; i++) {

            System.out.println(i + " x " + N + " = " + N * i);

        }
        scan.close();
    }
}
