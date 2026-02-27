/*Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, o segundo elemento com o penúltimo, etc., 
até trocar o 10º com o 11º. Mostre o vetor modificado.

Entrada
A entrada contém 20 valores inteiros, positivos ou negativos.

Saída
Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição. */

import java.util.Scanner;

public class TrocaVetorI1175 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorOriginal = new int[20];
        int[] vetorInvertido = new int[20];
        int i;
        int j = 0;
        for (i = 0; i < 20; i++) {
            vetorOriginal[i] = scan.nextInt();

        }

        for (i = 19; i >= 0; i--) {

            vetorInvertido[j] = vetorOriginal[i];
            System.out.printf("N[%d] = %d\n", j, vetorInvertido[j]);
            j++;

        }
        scan.close();

    }

}
