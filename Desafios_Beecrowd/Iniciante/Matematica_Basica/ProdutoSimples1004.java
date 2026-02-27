import java.util.Scanner;

public class ProdutoSimples1004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int PROD = A * B;
        scan.close();
        System.out.println("PROD = " + PROD);

    }

}
