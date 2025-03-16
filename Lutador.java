
public class Lutador extends Heroi {
    private EArma arma;

    public Lutador(String nome, int nivel, EArma arma) {
        super(nome, EClasses.guerreiro, nivel);
        this.arma = arma;
    }

    public void atacar() {
        System.out.println(super.getNome() + " ataca com  " + arma + "!");
    }

}