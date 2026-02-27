import java.util.Scanner;

public class CalculoSimples1010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peça1 = scan.nextInt();
        int quantidadePeça1 = scan.nextInt();
        double valorPeça1 = scan.nextDouble();
        int peça2 = scan.nextInt();
        int quantidadePeça2 = scan.nextInt();
        double valorPeça2 = scan.nextDouble();

        double totalPago = quantidadePeça1 * valorPeça1 + quantidadePeça2 * valorPeça2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPago);
        scan.close();
    }

}
