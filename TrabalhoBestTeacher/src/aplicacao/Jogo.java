package aplicacao;

import entidades.Aventureiro;
import entidades.Monstro;
import entidades.Personagem;
import entidades.Arma;
import entidades.Armadura;

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

    // Equipando aventureiro com itens
    Arma espada = new Arma("Espada de Ferro", 20);
    Armadura escudo = new Armadura("Escudo de Ferro", 10);
    
    aventureiro.equiparArma(espada);
    aventureiro.equiparArmadura(escudo);

    // Equipando monstros com itens
    Arma garra = new Arma("Garras afiadas", 15);
    Armadura couro = new Armadura("Armadura de Couro", 5);
    
    monstro.equiparArma(garra);
    monstro.equiparArmadura(couro);
    }
  }