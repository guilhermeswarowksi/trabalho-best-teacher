package entidades;

public class Aventureiro extends Personagem {

	//super para herdar da classe pai (Personagem)
    public Aventureiro(String nome) {
        super(nome, 100, 30, 15); // Exemplo de atributos: 100 de vida, 30 de ataque e 15 de defesa
    }
}