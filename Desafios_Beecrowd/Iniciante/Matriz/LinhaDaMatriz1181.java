import java.util.Scanner;

public class LinhaDaMatriz1181 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linhaMatriz = scan.nextInt();
        char operacaoAlgebrica = scan.next().toUpperCase().charAt(0);
        float somaMatriz = 0;

        float[][] matriz = new float[12][12];

        // entrada na matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scan.nextFloat();

            }

        }
        // decisão soma
        if (operacaoAlgebrica == 'S') {
            for (int i = 0; i < matriz[linhaMatriz].length; i++) {

                somaMatriz = somaMatriz + matriz[linhaMatriz][i];

            }
        }
        // decisão média
        if (operacaoAlgebrica == 'M') {
            for (int i = 0; i < matriz[linhaMatriz].length; i++) {
                somaMatriz = somaMatriz + matriz[linhaMatriz][i];

            }
            somaMatriz = somaMatriz / 12;
        }

        System.out.printf("%.1f\n", somaMatriz);
        scan.close();
    }
}