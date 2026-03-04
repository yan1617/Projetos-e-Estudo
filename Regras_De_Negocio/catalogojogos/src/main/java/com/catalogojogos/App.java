package com.catalogojogos;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Jogo> listadeJogos = new ArrayList<>();
        int i = 0;
        while (i == 0) {
            Jogo novoJogo = new Jogo();
            System.out.println("Digite o nome do Jogo");
            novoJogo.nome = scan.nextLine();
            System.out.println("Digite o gênero ");
            novoJogo.genero = scan.nextLine();
            System.out.println("Digite a plataforma do");
            novoJogo.plataforma = scan.nextLine();
            System.out.println("Digite o preço ");
            novoJogo.preco = scan.nextDouble();
            System.out.println("Digite o ano de lançamento");
            novoJogo.anoDeLancamento = scan.nextInt();
            String enter = scan.nextLine();
            listadeJogos.add(novoJogo);
            System.out.println("Ditige 0 para repetir e 1 para concluir");
            i = scan.nextInt();
            enter = scan.nextLine();
        }
        for (i = 0; i < listadeJogos.size(); i++) {
            System.out.println("Nome :" + listadeJogos.get(i).nome);
            System.out.println("Preço :" + listadeJogos.get(i).preco);
        }

        scan.close();
    }
}
