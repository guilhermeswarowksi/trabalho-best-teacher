package entidades;

public abstract class Personagem {
	//protected é o meio termo entre private e public, faz com que seja possivel acessar aq e nas subclasses
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected Arma arma;
    protected Armadura armadura;
    
    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    public void equiparArma(Arma arma) {
        this.arma = arma;
        this.ataque += arma.getPoderAtaque();  // Aumenta o ataque com a arma equipada
    }
    public void equiparArmadura(Armadura armadura) {
        this.armadura = armadura;
        this.defesa += armadura.getPoderDefesa();  // Aumenta a defesa com a armadura equipada
    }
    
    
    public boolean estaVivo() { //não pensei em como fazer o verificador de vivo ou morto ainda :(
        return this.vida > 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }
    
    public Arma getArma() {
        return arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }
    
}   