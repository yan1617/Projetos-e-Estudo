/*Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor N[10]. 
Em cada posição subsequente, coloque o dobro do valor da posição anterior. 
Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.

Entrada
A entrada contém um valor inteiro (V<=50).

Saída
Para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e X é o valor armazenado na posição i. 
O primeiro número do vetor N (N[0]) irá receber o valor de V. */

import java.util.Scanner;

public class Preenchimento_de_Vetor_I_1173 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorDobro = new int[10];
        vetorDobro[0] = scan.nextInt();

        int i;

        for (i = 0; i < 10; i++) {

            if (vetorDobro[0] == vetorDobro[i]) {
                System.out.printf("N[%d] = %d\n", i, vetorDobro[i]);
            }

            else {
                vetorDobro[i] = vetorDobro[i - 1] * 2;
                System.out.printf("N[%d] = %d\n", i, vetorDobro[i]);
            }

        }
        scan.close();

    }

}
