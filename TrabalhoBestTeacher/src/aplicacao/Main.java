package aplicacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aventureiro: ");
        String nomeAventureiro = scanner.nextLine();

        System.out.print("Digite o nome do monstro: ");
        String nomeMonstro = scanner.nextLine();

        Jogo jogo = new Jogo(nomeAventureiro, nomeMonstro);
        jogo.comecar();

    }
}
