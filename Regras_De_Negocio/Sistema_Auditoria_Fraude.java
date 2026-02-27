package Regras_De_Negocio;

import java.util.Scanner;

public class Sistema_Auditoria_Fraude {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o tamanho da tabela de registros");
        int tamanhoArray = scan.nextInt();
        String[][] registroDeCompras = new String[tamanhoArray][tamanhoArray];
        double[][] registroValorDeCompras = new double[tamanhoArray][tamanhoArray];
        double somaLinha = 0;
        double somaTotal = 0;
        // entrada dados registro de compras e horarios(manhã,tarde,noite)
        for (int i = 0; i < registroDeCompras.length; i++) {

            for (int j = 0; j < registroDeCompras[i].length; j++) {
                registroDeCompras[i][j] = scan.next();
            }

        }
        // entrada dos registros de valor das compras
        for (int i = 0; i < registroValorDeCompras.length; i++) {
            for (int j = 0; j < registroDeCompras[i].length; j++) {
                registroValorDeCompras[i][j] = scan.nextDouble();
            }
        }

        System.out.println("Escolha a linha da tabela para avaliação");
        int linhaSoma = scan.nextInt();

        for (int i = 0; i < registroValorDeCompras[linhaSoma].length; i++) {
            somaLinha = somaLinha + registroValorDeCompras[linhaSoma][i];
        }
        for (double[] soma : registroValorDeCompras) {
            for (double soma2 : soma) {
                somaTotal = somaTotal + soma2;

            }
        }

        if (somaLinha > 5000) {
            System.out.println("ALERTA: BLOQUEAR CARTAO");
        } else if (somaTotal / Math.pow(tamanhoArray, 2) > 1000) {
            System.out.println("ALERTA: BLOQUEAR CARTAO");

        } else {
            System.out.println("CARTÃO LIBERADO");
        }
        scan.close();
    }

}
