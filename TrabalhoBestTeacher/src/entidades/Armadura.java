package entidades;

public class Armadura {
    private String nome;
    private int poderDefesa;

    public Armadura(String nome, int poderDefesa) {
        this.nome = nome;
        this.poderDefesa = poderDefesa;
    }

    public String getNome() {
        return nome;
    }

    public int getPoderDefesa() {
        return poderDefesa;
    }
}