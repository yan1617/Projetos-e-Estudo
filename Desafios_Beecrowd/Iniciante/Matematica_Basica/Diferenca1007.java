import java.util.Scanner;

public class Diferenca1007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        scan.close();
        System.out.println("DIFERENCA = " + (A * B - C * D));

    }
}
