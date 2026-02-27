
import java.util.Scanner;

public class PreenchimentoVetorI1173 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int i;

        for (i = 2; i <= N;) {

            double resultado = Math.pow(i, 2);

            System.out.printf("%d^2 = %.0f\n", i, resultado);
            i = i + 2;
        }

        scan.close();
    }

}
