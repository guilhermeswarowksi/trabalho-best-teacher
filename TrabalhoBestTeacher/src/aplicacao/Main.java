package aplicacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do herói: ");
        String nomeHeroi = scanner.nextLine();

        System.out.print("Digite o nome do monstro: ");
        String nomeMonstro = scanner.nextLine();

        Jogo jogo = new Jogo(nomeHeroi, nomeMonstro);
        jogo.comecar();

    }
}
