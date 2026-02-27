import java.util.Scanner;

public class ColunaDaMatriz1182 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coluna = scan.nextInt();
        char operacaoAlgebrica = scan.next().toUpperCase().charAt(0);
        float somaColuna = 0;
        float[][] matrizSomaColuna = new float[12][12];

        // entrada
        for (int i = 0; i < matrizSomaColuna.length; i++) {
            for (int j = 0; j < matrizSomaColuna[i].length; j++) {
                matrizSomaColuna[i][j] = scan.nextFloat();
            }

        }

        for (int i = 0; i < matrizSomaColuna.length; i++) {
            somaColuna = somaColuna + matrizSomaColuna[i][coluna];

        }
        if (operacaoAlgebrica == 'S') {
            System.out.printf("%.1f\n", somaColuna);

        } else if (operacaoAlgebrica == 'M') {
            somaColuna = somaColuna / 12;
            System.out.printf("%.1f\n", somaColuna);
        }
        scan.close();
    }
}
