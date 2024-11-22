package aplicacao;

import entidades.Aventureiro;
import entidades.Monstro;
import entidades.Personagem;

import java.util.Random;

public class Jogo {

    private Aventureiro aventureiro;
    private Monstro monstro;

    public Jogo(String nomeAventureiro, String nomeMonstro) {
        this.aventureiro = new Aventureiro(nomeAventureiro);
        this.monstro = new Monstro(nomeMonstro);
    }
    public void comecar() {
        Random random = new Random();

        // Decidindo quem começa o turno, acredito que por turnos seja melhor:)
        // ? = operador Ternário, forma mais rapida de fzr if-else
        boolean turnoAventureiro = random.nextBoolean();
        System.out.println(turnoAventureiro ? aventureiro.getNome() + " começa atacando!" : monstro.getNome() + " começa atacando!");
    
    
    
    
    }
}