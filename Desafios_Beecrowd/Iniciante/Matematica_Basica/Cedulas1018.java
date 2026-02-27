/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, 
conforme o exemplo fornecido. */

import java.util.Scanner;

public class Cedulas1018 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valorParaTrocar = scan.nextInt();
        int[] cedulas = { 100, 50, 20, 10, 5, 2, 1 };
        int i;
        System.out.println(valorParaTrocar);
        int resto = valorParaTrocar;

        for (i = 0; i < cedulas.length; i++) {
            int quantidadeDeNotas = resto / cedulas[i];
            System.out.printf("%d nota(s) de R$ %d,00\n", quantidadeDeNotas, cedulas[i]);
            resto = resto % cedulas[i];

        }
        scan.close();
    }
}