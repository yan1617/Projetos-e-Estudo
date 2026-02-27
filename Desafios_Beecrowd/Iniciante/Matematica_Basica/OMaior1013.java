/*Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior". */

import java.util.Scanner;

public class OMaior1013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maiordeTodos = (C + maiorAB + Math.abs(C - maiorAB)) / 2;

        System.out.println(maiordeTodos + " eh o maior");
        scan.close();
    }
}