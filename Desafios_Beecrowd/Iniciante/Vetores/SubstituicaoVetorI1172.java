/*Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do vetor X por 1. 
Em seguida mostre o vetor X.

Entrada
A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

Saída
Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição. */

import java.util.Scanner;

public class SubstituicaoVetorI1172 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorX = new int[10];
        int i;

        for (i = 0; i < 10; i++) {
            vetorX[i] = scan.nextInt();
        }

        for (i = 0; i < 10; i++) {

            if (vetorX[i] <= 0) {
                vetorX[i] = 1;
                System.out.printf("X[%d] = %d\n", i, vetorX[i]);
            } else {
                System.out.printf("X[%d] = %d\n", i, vetorX[i]);
            }

        }
        scan.close();

    }
}
