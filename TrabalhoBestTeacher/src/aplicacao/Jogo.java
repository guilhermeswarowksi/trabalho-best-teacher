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
}