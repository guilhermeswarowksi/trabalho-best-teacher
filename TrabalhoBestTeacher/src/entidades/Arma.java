package entidades;

public class Arma {
    private String nome;
    private int poderAtaque;

    public Arma(String nome, int poderAtaque) {
        this.nome = nome;
        this.poderAtaque = poderAtaque;
    }

    public String getNome() {
        return nome;
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }
    
}