import java.util.Scanner;

public class AcimaDaDiagonalPrincipal1183 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char operacao = scan.next().toUpperCase().charAt(0);
        double[][] matrizDiagonal = new double[12][12];
        double soma = 0;
        int denominadorMedia = 0;

        // entrada
        for (int i = 0; i < matrizDiagonal.length; i++) {

            for (int j = 0; j < matrizDiagonal[i].length; j++) {
                matrizDiagonal[i][j] = scan.nextFloat();

            }

        }
        for (int i = 0; i < matrizDiagonal.length; i++) {
            for (int j = 0; j < matrizDiagonal[i].length; j++) {
                if (j > i) {
                    soma = soma + matrizDiagonal[i][j];
                    denominadorMedia++;
                }
            }

        }
        if (operacao == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (operacao == 'M') {
            double media = soma / denominadorMedia;
            System.out.printf("%.1f\n", media);
        }
        scan.close();
    }

}
