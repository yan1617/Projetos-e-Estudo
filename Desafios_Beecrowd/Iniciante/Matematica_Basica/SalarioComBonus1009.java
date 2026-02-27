
import java.util.Scanner;

public class SalarioComBonus1009 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome = scan.next();
        double salarioFixo = scan.nextDouble();
        double valorTotalDeVenda = scan.nextDouble();
        double salarioTotal = valorTotalDeVenda * 0.15 + salarioFixo;
        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);

        scan.close();
    }

}
